<?php
include('C:\Users\andriel.silva\Desktop\projetos andriel\ns-suite-php-master-att\src\NSSuite.php');
include('C:\Users\andriel.silva\Desktop\projetos andriel\ns-suite-php-master-att\src\Layouts\NFe\NFeJSON.php');

//Declaração das variáveis utilizando as classes do layout de JSOn(NFe.JSON)
$NSSuite = new NSSuite;
$NFeJSON = new NFeJSON;
$nfe = new Nfe;
$infNFe = new Infnfe;
$ide = new Ide;
$emit = new Emit;
$enderEmit = new EnderEmit;
$dest = new Dest;
$enderDest = new EnderDest;
$det = array();
$detAux1 = new Det;
$detAux2 = new Det; // Segundo produto
$det[] = $detAux1;
$det[] = $detAux2; // Adicionando o segundo produto ao array
$prod1 = new Prod;
$prod2 = new Prod; // Segundo produto
$imposto1 = new Imposto;
$imposto2 = new Imposto;
$icms = new ICMS;
$icmssn102 = new ICMSSN102;
$cofins = new COFINS;
$cofinsAliq = new COFINSAliq;
$total = new Total;
$icmsTot = new Icmstot;
$transp = new Transp;
$pag = new Pag;
$detPag = array();
$detPagAux = new Detpag;
$detPag[] = $detPagAux;
$infRespTec = new Infresptec;

//Inicio da criaçao do JSON
$NFeJSON->NFe = $nfe;
$nfe->infNFe = $infNFe;
$infNFe->versao = "4.00";

$infNFe->ide = $ide;
// Definição dos dados do primeiro produto
$ide->cUF = "43";
$ide->cNF = "00006990";
$ide->natOp = "VENDA";
$ide->mod = "65";
$ide->serie = "99";
$ide->nNF = "124";
$ide->dhEmi = "2024-06-10T11:14:01-03:00";
$ide->tpNF = "1";
$ide->idDest = "1";
$ide->cMunFG = "4303509";
$ide->tpImp = "4";
$ide->tpEmis = "1";
$ide->cDV = "0";
$ide->tpAmb = "2";
$ide->finNFe = "1";
$ide->indFinal = "1";
$ide->indPres = "4";
$ide->indIntermed = "0";
$ide->procEmi = "0";
$ide->verProc = "1.0.0.0|NS_CLIENT";

$infNFe->emit = $emit;
$emit->CNPJ = "07364617000135";
$emit->xNome = "NF-E EMITIDA EM AMBIENTE DE HOMOLOGACAO - SEM VALOR FISCAL";

$emit->enderEmit = $enderEmit;
$enderEmit->xLgr = "AV ANTONIO DURO";
$enderEmit->nro = "0";
$enderEmit->xBairro = "OLARIA";
$enderEmit->cMun = "4303509";
$enderEmit->xMun = "CAMAÇUÃ";
$enderEmit->UF = "RS";
$enderEmit->CEP = "96180000";
$enderEmit->cPais = "1058";
$enderEmit->xPais = "BRASIL";

$emit->IE = "0170108708";
$emit->CRT = "1";

$infNFe->dest = $dest;
$dest->CPF = "02715522045";
$dest->xNome = "NF-E EMITIDA EM AMBIENTE DE HOMOLOGACAO - SEM VALOR FISCAL";

$dest->enderDest = $enderDest;
$enderDest->xLgr = "AV MARFIM";
$enderDest->nro = "307";
$enderDest->xBairro = "INDUSTRIAL 2";
$enderDest->cMun = "3114204";
$enderDest->xMun = "CARMO DO CAJURU";
$enderDest->UF = "MG";
$enderDest->CEP = "35557000";
$enderDest->cPais = "1058";
$enderDest->xPais = "BRASIL";

$dest->indIEDest = "9";
$dest->email = "email@email.com";

$infNFe->det = $det;
// Definição dos dados do primeiro produto
$detAux1->nItem = 1;
$detAux1->prod = $prod1;
$prod1->cProd = "CL16";
$prod1->cEAN = "SEM GTIN";
$prod1->xProd = "NOTA FISCAL EMITIDA EM AMBIENTE DE HOMOLOGACAO - SEM VALOR FISCAL";
$prod1->NCM = "61034900";
$prod1->CFOP = "5102";
$prod1->uCom = "pc";
$prod1->qCom = "1";
$prod1->vUnCom = "69";
$prod1->vProd = "69";
$prod1->cEANTrib = "SEM GTIN";
$prod1->uTrib = "pc";
$prod1->qTrib = "1";
$prod1->vUnTrib = "69";
$prod1->indTot = "1";
$prod1->nItemPed = "4144";

$detAux1->imposto = $imposto1;
$imposto1->vTotTrib = "69";

$imposto1->ICMS = $icms;
$icms->ICMSSN102 = $icmssn102;
$icmssn102->orig = "0";
$icmssn102->CSOSN = "102";

$imposto1->COFINS = $cofins;
$cofins->COFINSAliq = $cofinsAliq;
$cofinsAliq->CST = "01";
$cofinsAliq->vBC = "69";
$cofinsAliq->pCOFINS = "0";
$cofinsAliq->vCOFINS = "0.00";

// Definição dos dados do segundo produto
$detAux2->nItem = 2;
$detAux2->prod = $prod2;
$prod2->cProd = "CL17"; // Código do segundo produto
$prod2->cEAN = "SEM GTIN";
$prod2->xProd = "SEGUNDO PRODUTO"; // Descrição do segundo produto
$prod2->NCM = "61034900";
$prod2->CFOP = "5102";
$prod2->uCom = "pc";
$prod2->qCom = "1";
$prod2->vUnCom = "50"; // Valor do segundo produto
$prod2->vProd = "50"; // Valor do segundo produto
$prod2->cEANTrib = "SEM GTIN";
$prod2->uTrib = "pc";
$prod2->qTrib = "1";
$prod2->vUnTrib = "50"; // Valor do segundo produto
$prod2->indTot = "1";
$prod2->nItemPed = "4145"; // Número do pedido do segundo produto

$detAux2->imposto = $imposto2;
$imposto2->vTotTrib = "50"; // Valor do tributo do segundo produto

$imposto2->ICMS = $icms;
$icms->ICMSSN102 = $icmssn102;
$icmssn102->orig = "0";
$icmssn102->CSOSN = "102";

$imposto2->COFINS = $cofins;
$cofins->COFINSAliq = $cofinsAliq;
$cofinsAliq->CST = "01";
$cofinsAliq->vBC = "50"; // Valor do segundo produto
$cofinsAliq->pCOFINS = "0";
$cofinsAliq->vCOFINS = "0.00";

$infNFe->total = $total;
$total->ICMSTot = $icmsTot;
$icmsTot->vBC = "0.00";
$icmsTot->vICMS = "0.00";
$icmsTot->vICMSDeson = "0.00";
$icmsTot->vBCST = "0.00";
$icmsTot->vST = "0.00";
$icmsTot->vProd = "119"; // Soma dos valores dos dois produtos
$icmsTot->vFrete = "0.00";
$icmsTot->vSeg = "0.00";
$icmsTot->vFCP = "0.00";
$icmsTot->vFCPST = "0.00";
$icmsTot->vFCPSTRet = "0.00";
$icmsTot->vIPIDevol = "0.00";
$icmsTot->vDesc = "0.00";
$icmsTot->vII = "0.00";
$icmsTot->vIPI = "0.00";
$icmsTot->vPIS = "0.00";
$icmsTot->vCOFINS = "0.00";
$icmsTot->vOutro = "0.00";
$icmsTot->vTotTrib = "119"; // Soma dos tributos dos dois produtos
$icmsTot->vNF = "119"; // Valor total da nota fiscal

$infNFe->transp = $transp;
$transp->modFrete = "0";
$transp->transporta = array(
    "xNome" => "NOME EXEMPLO",
    "IE" => "123456789",
    "xEnder" => "ENDEREÇO EXEMPLO RUA TESTE",
    "UF" => "RS",
    "xMun" => "CAMAQUA",
    "CNPJ" => "07364617000135"
);

$infNFe->pag = $pag;
$pag->vTroco = "0.00";
$pag->detPag = $detPag;
$detPagAux->indPag = "0";
$detPagAux->tPag = "01";
$detPagAux->vPag = "119"; // Soma dos valores dos dois produtos

$infNFe->infRespTec = $infRespTec;
$infRespTec->CNPJ = "07364617000135";
$infRespTec->xContato = "CONTATO TESTE";
$infRespTec->email = "email@email.com";
$infRespTec->fone = "13997206060";
//Fim da criação do JSON

//Declaração das variáveis que serão utilizas como parâmetros
$conteudo = json_encode($NFeJSON, JSON_UNESCAPED_UNICODE);//transformar conteúdo em JSON
$tpConteudo  = "json";
$cnpjEmit    = "07364617000135";
$tpDown      = "XP";
$tpAmb       = "2";
$caminho     = "./Notas";
$exibeNaTela = true;

//Chamada da função para emissão
$retorno = $NSSuite->emitirNFCeSincrono($conteudo, $tpConteudo, $tpAmb, $caminho, $exibeNaTela);
$retorno = json_decode($retorno, true);//Transforma o retorno em JSON
var_dump($retorno);//Mostra o retorno
?>
