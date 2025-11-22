package src.com.server;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import src.com.DAO.Air_Lift;
import src.com.DAO.TanqueAgitado;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

import org.json.JSONObject;

public class BioreactorServlet {

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        server.createContext("/bioreactor", new BioreactorHandler());

        server.setExecutor(null);
        server.start();

        System.out.println("Servidor iniciado en http://localhost:8080");
        System.out.println("Abre frontend/index.html en tu navegador");
    }

    static class BioreactorHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {

            exchange.getResponseHeaders().add("Access-Control-Allow-Origin", "*");
            exchange.getResponseHeaders().add("Access-Control-Allow-Methods", "GET, POST, OPTIONS");
            exchange.getResponseHeaders().add("Access-Control-Allow-Headers", "Content-Type");

            if ("OPTIONS".equals(exchange.getRequestMethod())) {
                exchange.sendResponseHeaders(204, -1);
                return;
            }

            if ("POST".equals(exchange.getRequestMethod())) {
                InputStream inputStream = exchange.getRequestBody();
                String body = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);

                JSONObject jsonRequest = new JSONObject(body);
                String type = jsonRequest.getString("type");

                String jsonResponse;

                if ("airlift".equals(type)) {
                    Air_Lift airLift = new Air_Lift(
                        jsonRequest.getString("microorganismoInoculo"),
                        jsonRequest.getString("nombreDesarrollador"),
                        jsonRequest.getString("sustratoOptimo"),
                        jsonRequest.getDouble("optimoPh"),
                        jsonRequest.getString("luzAplicable"),
                        jsonRequest.getString("difusorEntra"),
                        jsonRequest.getDouble("alturaTanque"),
                        jsonRequest.getDouble("alturaRiser"),
                        jsonRequest.getDouble("diametroDownconer"),
                        jsonRequest.getDouble("diametroRiser"),
                        jsonRequest.getDouble("porcentajeOperacional"),
                        jsonRequest.getDouble("volumenTotal"),
                        jsonRequest.getDouble("volumenOperacional")
                    );

                    jsonResponse = toJSON(airLift);

                } else {
                    TanqueAgitado tanque = new TanqueAgitado(
                        jsonRequest.getString("microorganismoInoculo"),
                        jsonRequest.getString("nombreDesarrollador"),
                        jsonRequest.getString("sustratoOptimo"),
                        jsonRequest.getDouble("optimoPh"),
                        jsonRequest.getDouble("volumenOperacionalTa"),
                        jsonRequest.getDouble("volumenTotalTa"),
                        jsonRequest.getDouble("diametroTanque"),
                        jsonRequest.getDouble("diametroImpulsor"),
                        jsonRequest.getDouble("alturaTanqueTa"),
                        jsonRequest.getDouble("alturaLiquido"),
                        jsonRequest.getInt("numeroDeflectores"),
                        jsonRequest.getDouble("anchuraDeflectores"),
                        jsonRequest.getDouble("porcentajeOperacionalTa"),
                        jsonRequest.getDouble("separacionPared_Deflectores"),
                        jsonRequest.getDouble("longitudUtilAgitador"),
                        jsonRequest.getDouble("distanciaAgitador_Base"),
                        jsonRequest.getDouble("numeroAlabes"),
                        jsonRequest.getDouble("anchuraAlabes"),
                        jsonRequest.getDouble("longitudAlabes")
                    );

                    jsonResponse = toJSON(tanque);
                }

                exchange.getResponseHeaders().add("Content-Type", "application/json");
                exchange.sendResponseHeaders(200, jsonResponse.getBytes(StandardCharsets.UTF_8).length);
                OutputStream output = exchange.getResponseBody();
                output.write(jsonResponse.getBytes(StandardCharsets.UTF_8));
                output.flush();
                output.close();

            } else {
                String response = "Método no permitido";
                exchange.sendResponseHeaders(405, response.length());
                OutputStream output = exchange.getResponseBody();
                output.write(response.getBytes());
                output.close();
            }
        }

        private String toJSON(Air_Lift airLift) {
            JSONObject json = new JSONObject();
            json.put("microorganismoInoculo", airLift.getMicroorganismoInoculo());
            json.put("nombreDesarrollador", airLift.getNombreDesarrollador());
            json.put("sustratoOptimo", airLift.getSustratoOptimo());
            json.put("optimoPh", airLift.getOptimoPh());
            json.put("luzAplicable", airLift.getLuzAplicable());
            json.put("difusorEntra", airLift.getDifusorEntra());
            json.put("alturaTanque", airLift.getalturaTanque());
            json.put("alturaRiser", airLift.getAlturaRiser());
            json.put("diametroDownconer", airLift.getDiametroDownconer());
            json.put("diametroRiser", airLift.getDiametroRiser());
            json.put("porcentajeOperacional", airLift.getporcentajeOperacional());
            json.put("volumenTotal", airLift.getvolumenTotal());
            json.put("volumenOperacional", airLift.getvolumenOperacional());
            return json.toString();
        }

        private String toJSON(TanqueAgitado tanque) {
            JSONObject json = new JSONObject();
            json.put("microorganismoInoculo", tanque.getMicroorganismoInoculo());
            json.put("nombreDesarrollador", tanque.getNombreDesarrollador());
            json.put("sustratoOptimo", tanque.getSustratoOptimo());
            json.put("optimoPh", tanque.getOptimoPh());
            json.put("volumenOperacionalTa", tanque.getVolumenOperacionalTa());
            json.put("volumenTotalTa", tanque.getVolumenTotalTa());
            json.put("diametroTanque", tanque.getDiametroTanque());
            json.put("diametroImpulsor", tanque.getDiametroImpulsor());
            json.put("alturaTanqueTa", tanque.getalturaTanqueTa());
            json.put("alturaLiquido", tanque.getAlturaLiquido());
            json.put("numeroDeflectores", tanque.getNumeroDeflectores());
            json.put("anchuraDeflectores", tanque.getAnchuraDeflectores());
            json.put("porcentajeOperacionalTa", tanque.getPorcentajeOperacionalTa());
            json.put("separacionPared_Deflectores", tanque.getSeparacionPared_Deflectores());
            json.put("longitudUtilAgitador", tanque.getLongitudUtilAgitador());
            json.put("distanciaAgitador_Base", tanque.getDistanciaAgitador_Base());
            json.put("numeroAlabes", tanque.getNumeroAlabes());
            json.put("anchuraAlabes", tanque.getAnchuraAlabes());
            json.put("longitudAlabes", tanque.getLongitudAlabes());
            return json.toString();
        }
    }
}
