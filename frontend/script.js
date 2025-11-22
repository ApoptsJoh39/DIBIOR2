const API_URL = 'http://localhost:8080/bioreactor';

const typeBtns = document.querySelectorAll('.type-btn');
const airliftForm = document.getElementById('airliftForm');
const tanqueForm = document.getElementById('tanqueForm');
const formContainer = document.getElementById('formContainer');
const resultContainer = document.getElementById('resultContainer');
const resultContent = document.getElementById('resultContent');
const newCalculationBtn = document.getElementById('newCalculation');
const printResultsBtn = document.getElementById('printResults');

let currentType = 'airlift';

typeBtns.forEach(btn => {
    btn.addEventListener('click', () => {
        typeBtns.forEach(b => b.classList.remove('active'));
        btn.classList.add('active');

        const type = btn.dataset.type;
        currentType = type;

        airliftForm.classList.remove('active');
        tanqueForm.classList.remove('active');

        if (type === 'airlift') {
            airliftForm.classList.add('active');
        } else {
            tanqueForm.classList.add('active');
        }
    });
});

airliftForm.addEventListener('submit', async (e) => {
    e.preventDefault();
    await handleSubmit(airliftForm, 'airlift');
});

tanqueForm.addEventListener('submit', async (e) => {
    e.preventDefault();
    await handleSubmit(tanqueForm, 'tanque');
});

async function handleSubmit(form, type) {
    const formData = new FormData(form);
    const data = {};

    formData.forEach((value, key) => {
        if (key === 'numeroDeflectores') {
            data[key] = parseInt(value);
        } else if (value && !isNaN(value) && value.trim() !== '') {
            data[key] = parseFloat(value);
        } else {
            data[key] = value;
        }
    });

    data.type = type;

    try {
        const response = await fetch(API_URL, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(data)
        });

        if (!response.ok) {
            throw new Error('Error en la comunicación con el servidor');
        }

        const result = await response.json();
        displayResults(result, type);

    } catch (error) {
        alert('Error: ' + error.message + '\n\nAsegúrate de que el servidor Java esté ejecutándose en http://localhost:8080');
        console.error('Error:', error);
    }
}

function displayResults(data, type) {
    formContainer.style.display = 'none';
    resultContainer.classList.remove('hidden');

    let html = '<h3 style="color: #2a5298; margin-bottom: 20px;">Datos Básicos</h3>';

    html += `
        <div class="result-item">
            <span class="result-label">Microorganismo Inóculo:</span>
            <span class="result-value">${data.microorganismoInoculo}</span>
        </div>
        <div class="result-item">
            <span class="result-label">Desarrollador:</span>
            <span class="result-value">${data.nombreDesarrollador}</span>
        </div>
        <div class="result-item">
            <span class="result-label">Sustrato Óptimo:</span>
            <span class="result-value">${data.sustratoOptimo}</span>
        </div>
        <div class="result-item">
            <span class="result-label">pH Óptimo:</span>
            <span class="result-value">${data.optimoPh}</span>
        </div>
    `;

    if (type === 'airlift') {
        html += '<h3 style="color: #2a5298; margin: 30px 0 20px;">Especificaciones Air-Lift</h3>';
        html += `
            <div class="result-item">
                <span class="result-label">Luz Aplicable:</span>
                <span class="result-value">${data.luzAplicable}</span>
            </div>
            <div class="result-item">
                <span class="result-label">Difusor Entra:</span>
                <span class="result-value">${data.difusorEntra}</span>
            </div>
            <div class="result-item">
                <span class="result-label">Altura Tanque:</span>
                <span class="result-value">${data.alturaTanque} m</span>
            </div>
            <div class="result-item">
                <span class="result-label">Altura Riser:</span>
                <span class="result-value">${data.alturaRiser} m</span>
            </div>
            <div class="result-item">
                <span class="result-label">Diámetro Downconer:</span>
                <span class="result-value">${data.diametroDownconer} m</span>
            </div>
            <div class="result-item">
                <span class="result-label">Diámetro Riser:</span>
                <span class="result-value">${data.diametroRiser} m</span>
            </div>
            <div class="result-item">
                <span class="result-label">Porcentaje Operacional:</span>
                <span class="result-value">${data.porcentajeOperacional}%</span>
            </div>
            <div class="result-item">
                <span class="result-label">Volumen Total:</span>
                <span class="result-value">${data.volumenTotal} L</span>
            </div>
            <div class="result-item">
                <span class="result-label">Volumen Operacional:</span>
                <span class="result-value">${data.volumenOperacional} L</span>
            </div>
        `;
    } else {
        html += '<h3 style="color: #2a5298; margin: 30px 0 20px;">Especificaciones Tanque Agitado</h3>';
        html += `
            <div class="result-item">
                <span class="result-label">Volumen Operacional:</span>
                <span class="result-value">${data.volumenOperacionalTa} L</span>
            </div>
            <div class="result-item">
                <span class="result-label">Volumen Total:</span>
                <span class="result-value">${data.volumenTotalTa} L</span>
            </div>
            <div class="result-item">
                <span class="result-label">Diámetro Tanque:</span>
                <span class="result-value">${data.diametroTanque} m</span>
            </div>
            <div class="result-item">
                <span class="result-label">Diámetro Impulsor:</span>
                <span class="result-value">${data.diametroImpulsor} m</span>
            </div>
            <div class="result-item">
                <span class="result-label">Altura Tanque:</span>
                <span class="result-value">${data.alturaTanqueTa} m</span>
            </div>
            <div class="result-item">
                <span class="result-label">Altura Líquido:</span>
                <span class="result-value">${data.alturaLiquido} m</span>
            </div>
            <div class="result-item">
                <span class="result-label">Número de Deflectores:</span>
                <span class="result-value">${data.numeroDeflectores}</span>
            </div>
            <div class="result-item">
                <span class="result-label">Anchura Deflectores:</span>
                <span class="result-value">${data.anchuraDeflectores} m</span>
            </div>
            <div class="result-item">
                <span class="result-label">Porcentaje Operacional:</span>
                <span class="result-value">${data.porcentajeOperacionalTa}%</span>
            </div>
            <div class="result-item">
                <span class="result-label">Separación Pared-Deflectores:</span>
                <span class="result-value">${data.separacionPared_Deflectores} m</span>
            </div>
            <div class="result-item">
                <span class="result-label">Longitud Útil Agitador:</span>
                <span class="result-value">${data.longitudUtilAgitador} m</span>
            </div>
            <div class="result-item">
                <span class="result-label">Distancia Agitador-Base:</span>
                <span class="result-value">${data.distanciaAgitador_Base} m</span>
            </div>
            <div class="result-item">
                <span class="result-label">Número de Álabes:</span>
                <span class="result-value">${data.numeroAlabes}</span>
            </div>
            <div class="result-item">
                <span class="result-label">Anchura Álabes:</span>
                <span class="result-value">${data.anchuraAlabes} m</span>
            </div>
            <div class="result-item">
                <span class="result-label">Longitud Álabes:</span>
                <span class="result-value">${data.longitudAlabes} m</span>
            </div>
        `;
    }

    resultContent.innerHTML = html;
}

newCalculationBtn.addEventListener('click', () => {
    resultContainer.classList.add('hidden');
    formContainer.style.display = 'block';

    airliftForm.reset();
    tanqueForm.reset();
});

printResultsBtn.addEventListener('click', () => {
    window.print();
});
