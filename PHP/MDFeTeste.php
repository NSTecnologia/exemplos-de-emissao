<?php
include('C:\Users\andriel.silva\Desktop\projetos andriel\ns-suite-php-master-att\src\Layouts\MDFe\MDFeJSON.php');
include('C:\Users\andriel.silva\Desktop\projetos andriel\ns-suite-php-master-att\src\NSSuite.php');

//Declaração das variáveis urilizando as classes do layout de JSON(MDFe.json)
$NSSuite = new NSSuite;
$MDFeJSON = new MDFeJSON;
$mdfe = new MDFe;
$infMDFe = new Infmdfe;
$emit = new Emit;
$enderEmit = new Enderemit;
$ide = new Ide;
$infMunCarrega = array();
$infMunCarregaAux = new Infmuncarrega;
$infPercurso = array();
$infPercursoAux = new Infpercurso;
$infDoc = new Infdoc;
$infMunDescarga = array();
$infMunDescargaAux = new Infmundescarga;
$veicTracao = new Veictracao;
$condutor = new Condutor;
$tot = new Tot;

//inicio da criação do JSON
$MDFeJSON->MDFe = $mdfe;
$mdfe->infMDFe = $infMDFe;
$infMDFe->versao = "3.00";

$infMDFe->emit = $emit;
$emit->CNPJ = "07364617000135";
$emit->IE = "0170108708";
$emit->xFant = "MDF-E EMITIDO EM AMBIENTE DE HOMOLOGACAO - SEM VALOR FISCAL";
$emit->xNome = "EMITENTE TESTE";

$emit->enderEmit = $enderEmit;
$enderEmit->CEP = "96180000";
$enderEmit->UF = "RS";
$enderEmit->cMun = "4303509";
$enderEmit->fone = "7532235542";
$enderEmit->nro = "0";
$enderEmit->xBairro = "OLARIA";
$enderEmit->xLgr = "ANTONIO DURO";
$enderEmit->xMun = "CAMAQUA";

$infMDFe->ide = $ide;
$ide->UFFim = "RS";
$ide->UFIni = "RS";
$ide->cUF = "43";
$ide->tpAmb = "2";
$ide->tpEmis = "1";
$ide->tpEmit = "1";
$ide->dhEmi = "2024-06-11T15:40:24-03:00";
$ide->mod = "58";
$ide->modal = "1";
$ide->nMDF = "3";
$ide->procEmi = "0";
$ide->serie = "99";
$ide->verProc = "1.00";
$ide->UFFim = "RS";
$ide->UFIni = "RS";
$ide->dhIniViagem = "2024-06-11T15:10:00-02:00";
$ide->infMunCarrega = $infMunCarregaAux;
$infMunCarregaAux = new Infmuncarrega;
$infMunCarregaAux->cMunCarrega = "4304606";
$infMunCarregaAux->xMunCarrega = "Canoas";
$ide->infMunCarrega = $infMunCarregaAux;

$infMDFe->seg = new Seg;
$infMDFe->seg->infResp = new Infresp;
$infMDFe->seg->infResp->respSeg = "1";
$infMDFe->seg->infResp->CNPJ = "61573796000166";
$infMDFe->seg->infSeg = new Infseg;
$infMDFe->seg->infSeg->xSeg = "ALLIANZ SEGUROS S/A";
$infMDFe->seg->infSeg->CNPJ = "61573796000166";
$infMDFe->seg->nApol = "98765431";
$infMDFe->seg->nAver = "321654987";

$infMDFe->prodPred = new Prodpred;
$infMDFe->prodPred->tpCarga = "01";
$infMDFe->prodPred->xProd = "ARROZ";
$infMDFe->prodPred->infLotacao = new InfLotacao;
$infMDFe->prodPred->infLotacao->infLocalCarrega = new InflocalCarrega;
$infMDFe->prodPred->infLotacao->infLocalCarrega->latitude = "-31.776000";
$infMDFe->prodPred->infLotacao->infLocalCarrega->longitude = "-52.359400";
$infMDFe->prodPred->infLotacao->infLocalDescarrega = new InfLocalDescarrega;
$infMDFe->prodPred->infLotacao->infLocalDescarrega->latitude = "-31.776000";
$infMDFe->prodPred->infLotacao->infLocalDescarrega->longitude = "-52.359400";

$infMDFe->infDoc = $infDoc;
$infMunDescargaAux->cMunDescarga = "4304606";
$infMunDescargaAux->xMunDescarga = "Canoas";
$infCTe = new Infcte;
$infCTe->chCTe = "43240607364617000135570990000000051000009845";
$infMunDescargaAux->infCTe[] = $infCTe;
$infDoc->infMunDescarga[] = $infMunDescargaAux;

$infModal = new InfModal;
$infMDFe->infModal = $infModal;
$infModal->versaoModal = "3.00";

$rodo = new Rodo;

$infModal->rodo = $rodo;
$rodo->infANTT = new Infantt;
$rodo->infANTT->RNTRC = "03304621";

$rodo->infANTT->valePed = new Valeped;
$rodo->infANTT->valePed->disp = new Disp;
$rodo->infANTT->valePed->disp->CNPJForn = "04088208000165";
$rodo->infANTT->valePed->disp->CNPJPg = "07364617000135";
$rodo->infANTT->valePed->disp->nCompra = "100";
$rodo->infANTT->valePed->disp->vValePed = "100";
$rodo->infANTT->valePed->disp->tpValePed = "03";
$rodo->infANTT->valePed->categCombVeic = "02";

$rodo->infANTT->infContratante = new Infcontratante;
$rodo->infANTT->infContratante->CNPJ = "07364617000135";

$rodo->infANTT->infPag = new Infpag;
$rodo->infANTT->infPag->CNPJ = "07364617000135";

$rodo->infANTT->infPag->Comp = new Comp;
$rodo->infANTT->infPag->Comp->tpComp = "99";
$rodo->infANTT->infPag->Comp->vComp = "1500";
$rodo->infANTT->infPag->Comp->xComp = "TESTE";

$rodo->infANTT->infPag->vContrato = "1500";
$rodo->infANTT->infPag->indPag = "1";
$rodo->infANTT->infPag->indAltoDesemp = "1";
$rodo->infANTT->infPag->vAdiant = "500";

$rodo->infANTT->infPag->infPrazo = new Infprazo;
$rodo->infANTT->infPag->infPrazo->nParcela = "001";
$rodo->infANTT->infPag->infPrazo->dVenc = "2024-07-06";
$rodo->infANTT->infPag->infPrazo->vParcela = "1000";

$rodo->infANTT->infPag->infBanc = new Infbanc;
$rodo->infANTT->infPag->infBanc->PIX = "+5551981494036";

$rodo->veicTracao = new Veictracao;
$rodo->veicTracao->placa = "IIA6666";
$rodo->veicTracao->tara = "0";
$rodo->veicTracao->capKG = "10000";
$rodo->veicTracao->capM3 = "35";
$rodo->veicTracao->condutor = new Condutor;
$rodo->veicTracao->condutor->xNome = "TESTE 1";
$rodo->veicTracao->condutor->CPF = "03991833026";
$rodo->veicTracao->tpRod = "06";
$rodo->veicTracao->tpCar = "02";
$rodo->veicTracao->UF = "RS";

$infMDFe->tot = $tot;
$tot->cUnid = "01";
$tot->qCTe = "1";
$tot->qCarga = "10000.0000";
$tot->qMDFe = "0";
$tot->qNFe = "0";
$tot->vCarga = "43.26";
//fim da criação do JSON

//Declaracao das variaveis que serão utilizadas como parâmetros
$conteudo = json_encode($MDFeJSON, JSON_UNESCAPED_UNICODE);//Trnsformando conteudo em JSON
$tpConteudo  = "json";
$cnpjEmit    = "07364617000135";
$tpDown      = "XP";
$tpAmb       = "2";
$caminho     = "C:\\Users\\andriel.silva\\Desktop\\projetos andriel\\ns-suite-php-master-att\\Notas";
$exibeNaTela = true;

//chamada da função
$retorno = $NSSuite->emitirMDFeSincrono($conteudo, $tpConteudo, $cnpjEmit, $tpDown, $tpAmb, $caminho, $exibeNaTela);
$retorno = json_decode($retorno, true);//Transformar retorno em JSON
var_dump($retorno);//Mostrar retorno
?>
