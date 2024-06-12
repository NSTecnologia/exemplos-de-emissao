<?php
include('C:\Users\andriel.silva\Desktop\projetos andriel\ns-suite-php-master-att\src\NSSuite.php');
include('C:\Users\andriel.silva\Desktop\projetos andriel\ns-suite-php-master-att\src\Layouts\CTe\CTeJSON.php');

//Declaração das variáveis utilizando as clases do layout em JSON(CTeJSON)
$NSSuite = new NSSuite;
$CTeJSON = new CTeJSON;
$cte = new CTe;
$infCte = new InfCte;
$ide = new Ide;
$compl = new Compl;
$obsCont = new ObsCont;
$emit = new Emit;
$enderEmit = new EnderEmit;
$rem = new Remetente;
$enderReme = new EnderReme;
$dest = new Dest;
$enderDest = new EnderDest;
$vPrest = new VPrest;
$comp1 = new Comp;
$comp2 = new Comp;
$imp = new Imp;
$icms = new ICMS;
$icmssn = new ICMSSN;
$infCTeNorm = new InfCTeNorm;
$infCarga = new InfCarga;
$infQ = new InfQ;
$infDoc = new InfDoc;
$infNFe = new InfNFe;
$infRespTec = new InfRespTec;
$infModal = new InfModal;
$rodo = new Rodo;

//Inicio da criação do JSON
$CTeJSON->CTe = $cte;
$cte->infCte = $infCte;
$infCte->versao = "4.00";

$infCte->ide = $ide;
$ide->cUF = "43";
$ide->cCT = "00000984";
$ide->CFOP = "5353";
$ide->natOp = "SERVICO DE TRANSPORTE";
$ide->mod = "57";
$ide->serie = "99";
$ide->nCT = "9";
$ide->dhEmi = "2024-06-10T10:15:05-03:00";
$ide->tpImp = "2";
$ide->tpEmis = "1";
$ide->cDV = "4";
$ide->tpAmb = "2";
$ide->tpCTe = "0";
$ide->procEmi = "0";
$ide->verProc = "1.02|NS_API";
$ide->cMunEnv = "4303509";
$ide->xMunEnv = "CAMAQUA";
$ide->UFEnv = "RS";
$ide->modal = "01";
$ide->tpServ = "0";
$ide->cMunIni = "4303509";
$ide->xMunIni = "CAMAQUA";
$ide->UFIni = "RS";
$ide->cMunFim = "4303509";
$ide->xMunFim = "CAMAQUA";
$ide->UFFim = "RS";
$ide->retira = "1";
$ide->indIEToma = "1";
$ide->toma3 = array("toma" => "3");

$infCte->compl = $compl;
$compl->ObsCont = $obsCont;
$obsCont->xTexto = "andriel.silva@nstecnologia.com.br";
$obsCont->xCampo = "enviaEmail";

$infCte->emit = $emit;
$emit->CNPJ = "07364617000135";
$emit->IE = "0170108708";
$emit->xNome = "NEWS SYSTEMS LTDA";
$emit->CRT = "1";
$emit->xFant = "teste";

$emit->enderEmit = $enderEmit;
$enderEmit->xLgr = "ROD RST 470 KM 221 BLOCO A";
$enderEmit->nro = ".";
$enderEmit->xBairro = "GARIBALDINA";
$enderEmit->cMun = "4308607";
$enderEmit->xMun = "GARIBALDI";
$enderEmit->CEP = "95720000";
$enderEmit->UF = "RS";
$enderEmit->fone = "5434638266";

$infCte->rem = $rem;
$rem->CPF = "01229452044";
$rem->xNome = "CTE EMITIDO EM AMBIENTE DE HOMOLOGACAO - SEM VALOR FISCAL";
$rem->xFant = "max ferraz";
$rem->fone = "1939356598";

$rem->enderReme = $enderReme;
$enderReme->xLgr = "Estrada General Motors";
$enderReme->nro = "852";
$enderReme->xCpl = "Gp 17/18";
$enderReme->xBairro = "B. Caldeira";
$enderReme->cMun = "3520509";
$enderReme->xMun = "Indaiatuba";
$enderReme->CEP = "13347500";
$enderReme->UF = "SP";
$enderReme->cPais = "1058";
$enderReme->xPais = "Brasil";

$infCte->dest = $dest;
$dest->CNPJ = "07364617000135";
$dest->IE = "0170108708";
$dest->xNome = "CTE EMITIDO EM AMBIENTE DE HOMOLOGACAO - SEM VALOR FISCAL";

$dest->enderDest = $enderDest;
$enderDest->xLgr = "FAZENDA";
$enderDest->nro = "S/N";
$enderDest->xBairro = "ZONA RURAL";
$enderDest->cMun = "4303509";
$enderDest->xMun = "CAMAQUA";
$enderDest->UF = "RS";
$enderDest->cPais = "1058";
$enderDest->xPais = "BRASIL";

$infCte->vPrest = $vPrest;
$vPrest->vTPrest = "440.00";
$vPrest->vRec = "440.00";
$vPrest->Comp = [$comp1, $comp2];
$comp1->xNome = "Valor da Viagem";
$comp1->vComp = "396.00";
$comp2->xNome = "Valor do Seguro";
$comp2->vComp = "44.00";

$infCte->imp = $imp;
$imp->ICMS = $icms;
$icms->ICMSSN = $icmssn;
$icmssn->CST = "90";
$icmssn->indSN = "1";

$infCte->infCTeNorm = $infCTeNorm;
$infCTeNorm->infCarga = $infCarga;
$infCarga->vCarga = "22000.00";
$infCarga->proPred = "Maquina rebitadeira";
$infCarga->infQ = $infQ;
$infQ->cUnid = "01";
$infQ->tpMed = "Peso Bruto";
$infQ->qCarga = "380.0000";
$infCarga->vCargaAverb = "22000.00";

$infCTeNorm->infDoc = $infDoc;
$infDoc->infNFe = $infNFe;
$infNFe->chave = "43240607364617000135550990000000636985829463";

$cte->infRespTec = $infRespTec;
$infRespTec->CNPJ = "07364617000135";
$infRespTec->xContato = "Luciano";
$infRespTec->email = "luciano.languer@nstecnologia.com.br";
$infRespTec->fone = "5136921123";


$CTeJSON->infModal = $infModal;
$infModal->versaoModal = "4.00";
$infModal->rodo = $rodo;
$rodo->RNTRC = "04023389";
//fim da criação do json

//Declaração das variáveis que vão ser utilizadas como parãmetros
$conteudo = json_encode($CTeJSON, JSON_UNESCAPED_UNICODE); //transformando conteudo em json
$mod = "57";
$tpConteudo = "json";
$cnpjEmit = "07364617000135";
$tpDown = "XP";
$tpAmb = "2";
$tpDown = "XP";
$caminho = ".\Notas";
$exibeNaTela = false;

//chada da função para emitir
$retorno = $NSSuite->emitirCTeSincrono($conteudo, $mod, $tpConteudo, $cnpjEmit, $tpDown, $tpAmb, $caminho, $exibeNaTela);
$retorno = json_decode($retorno, true);//transformar retorno em JSON
var_dump($retorno);//Mostrar retorno
?>
