<?php
include('C:\Users\andriel.silva\Desktop\projetos andriel\ns-suite-php-master-att\src\NSSuite.php');
include('C:\Users\andriel.silva\Desktop\projetos andriel\ns-suite-php-master-att\src\Layouts\BPe\BPeJSON.php');

//Declaração das variáveis utilizando as classes do layout de json(BPeJSON)
$NSSuite = new NSSuite;
$BPeJSON = new BPeJSON;
$bpe = new Bpe;
$infBPe = new Infbpe;
$ide = new Ide;
$emit = new Emit;
$enderEmit = new EnderEmit;
$comp = new Comp;
$enderComp = new EnderComp;
$agencia = new Agencia;
$enderAgencia = new EnderAgencia;
$infPassagem = new Infpassagem;
$infPassageiro = new Infpassageiro;
$infViagem = new Infviagem;
$infValorBPe = new Infvalorbpe;
$imp = new Imp;
$icms = new ICMS;
$icms00 = new ICMS00;
$icmsUFFim = new ICMSUFFim;
$pag = new Pag;
$card = new Card;
$infRespTec = new Infresptec;

//Inicio montagem do JSON
$BPeJSON->BPe = $bpe;
$bpe->infBPe = $infBPe;
$infBPe->versao = "1.00";

$infBPe->ide = $ide;
$ide->cUF = "43";
$ide->cBP = "1";
$ide->tpAmb = "2";
$ide->mod = "63";
$ide->serie = "99";
$ide->nBP = "1";
$ide->cDV = "7";
$ide->modal = "1";
$ide->dhEmi = "2024-06-11T10:41:00-03:00";
$ide->tpEmis = "1";
$ide->verProc = "1.00";
$ide->tpBPe = "0";
$ide->indPres = "1";
$ide->UFIni = "RS";
$ide->cMunIni = "4314902";
$ide->UFFim = "PR";
$ide->cMunFim = "4106902";

$infBPe->emit = $emit;
$emit->CNPJ = "07364617000135";
$emit->IE = "0170108708";
$emit->xNome = "POLITUR TRANSPORTE E AGENCIA DE TURISMO LTDA";
$emit->IM = "516830";
$emit->CNAE = "1234567";
$emit->CRT = "1";

$emit->enderEmit = $enderEmit;
$enderEmit->xLgr = "RUA ANTONIO DURO";
$enderEmit->nro = "870";
$enderEmit->xBairro = "CENTRO";
$enderEmit->cMun = "4303509";
$enderEmit->xMun = "CAMAQUA";
$enderEmit->UF = "RS";

$emit->TAR = "113645236";

$infBPe->comp = $comp;
$comp->xNome = "Francisco Edinardo Vieira Dos Santos Filho";
$comp->CPF = "11111111111";

$comp->enderComp = $enderComp;
$enderComp->xLgr = "RUA ANDRADAS EM CURITIBANAS";
$enderComp->nro = "870";
$enderComp->xBairro = "CENTRO";
$enderComp->cMun = "4106902";
$enderComp->xMun = "CURITIBA";
$enderComp->UF = "PR";

$infBPe->agencia = $agencia;
$agencia->xNome = "AGENCIA LTDA";
$agencia->CNPJ = "07364617000135";

$agencia->enderAgencia = $enderAgencia;
$enderAgencia->xLgr = "Largo Vespasiano Julio Veppo";
$enderAgencia->nro = "870";
$enderAgencia->xBairro = "CENTRO";
$enderAgencia->cMun = "4303509";
$enderAgencia->xMun = "CAMAQUA";
$enderAgencia->UF = "RS";

$infBPe->infPassagem = $infPassagem;
$infPassagem->cLocOrig = "4314902";
$infPassagem->xLocOrig = "PORTO ALEGR";
$infPassagem->cLocDest = "4106902";
$infPassagem->xLocDest = "CURITIBA";
$infPassagem->dhEmb = "2024-06-11T16:40:00-03:00";
$infPassagem->dhValidade = "2025-06-11T16:40:00-03:00";

$infPassagem->infPassageiro = $infPassageiro;
$infPassageiro->xNome = "Rafael Dall Agnol Ecco";
$infPassageiro->tpDoc = "1";
$infPassageiro->nDoc = "03037398";

$infBPe->infViagem = $infViagem;
$infViagem->cPercurso = "1";
$infViagem->xPercurso = "teste da descricao do percurso";
$infViagem->tpViagem = "00";
$infViagem->tpServ = "11";
$infViagem->tpAcomodacao = "1";
$infViagem->tpTrecho = "1";
$infViagem->dhViagem = "2023-01-18T11:32:00-03:00";
$infViagem->poltrona = "5";
$infViagem->prefixo = "0023";
$infViagem->plataforma = "3";

$infBPe->infValorBPe = $infValorBPe;
$infValorBPe->vBP = "85.17";
$infValorBPe->vDesconto = "10.00";
$infValorBPe->tpDesconto = "01";
$infValorBPe->xDesconto = "TARIFA PROMOCIONAL";
$infValorBPe->vPgto = "75.17";
$infValorBPe->vTroco = "0.00";

$comp1 = new Comp;
$comp2 = new Comp;
$comp1->tpComp = "01";
$comp1->vComp = "65.17";
$comp2->tpComp = "03";
$comp2->vComp = "20.00";
$infValorBPe->Comp = [$comp1, $comp2];

$infBPe->imp = $imp;
$imp->ICMS = $icms;
$icms->ICMS00 = $icms00;
$icms00->CST = "00";
$icms00->vBC = "85.17";
$icms00->pICMS = "10";
$icms00->vICMS = "8.51";

$imp->ICMSUFFim = $icmsUFFim;
$icmsUFFim->vBCUFFim = "10.00";
$icmsUFFim->pFCPUFFim = "0.85";
$icmsUFFim->pICMSUFFim = "0.85";
$icmsUFFim->pICMSInter = "0.85";
$icmsUFFim->pICMSInterPart = "100";
$icmsUFFim->vFCPUFFim = "1";
$icmsUFFim->vICMSUFFim = "1";
$icmsUFFim->vICMSUFIni = "1";

$infBPe->pag = $pag;
$pag->tPag = "03";
$pag->vPag = "75.17";

$pag->card = $card;
$card->tBand = "01";
$card->tpIntegra = "1";

$infBPe->infRespTec = $infRespTec;
$infRespTec->CNPJ = "07364617000135";
$infRespTec->xContato = "Luciano";
$infRespTec->email = "cleiton.fagunde@nstecnologia.com.br";
$infRespTec->fone = "5136921123";
//fim do json 

//declaração das variáveis que vão ser enviadas como parâmetro
$conteudo = json_encode($BPeJSON, JSON_UNESCAPED_UNICODE); //transformar conteúdo em JSON
$tpConteudo = "json";
$tpDown = "XP";
$caminho = ".\Notas";
$exibeNaTela = false;

//chamada da função para emitir
$retorno = $NSSuite->emitirBPESincrono($conteudo, $tpConteudo, $emit->CNPJ, $tpDown, $ide->tpAmb, $caminho, $exibeNaTela);
$retorno = json_decode($retorno, true);//transformar retorno em JSON
var_dump($retorno); //mostrar retorno
?>