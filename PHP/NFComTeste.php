<?php
    include('C:\Users\andriel.silva\Desktop\projetos andriel\ns-suite-php-master-att\src\Layouts\NFCom\NFComJSON.php');
    include('C:\Users\andriel.silva\Desktop\projetos andriel\ns-suite-php-master-att\src\NSSuite.php');

    //Declaração das variáveis utilizando classes do layout de JSON(NFCOM.JSON)
    $NSSuite = new NSSuite;
    $NFComJSON = new NFComJSON;
    $nfcom = new NFCom;
    $infNFCom = new InfNFCom;
    $ide = new Ide;
    $emit = new Emit;
    $enderEmit = new EnderEmit;
    $dest = new Dest;
    $enderDest = new EnderDest;
    $assinante = new Assinante;
    $det = new Det;
    $prod = new Prod;
    $imposto = new Imposto;
    $icmssn = new ICMSSN;
    $pis = new PIS;
    $cofins = new COFINS;
    $total = new Total;
    $icmsTot = new Icmstot;
    $gFat = new GFat;

    //Inicio da criação do JSON
    $NFComJSON->NFCom = $nfcom;
    $nfcom->infNFCom = $infNFCom;
    $infNFCom->versao = "1.00";

    $infNFCom->ide = $ide;
    $ide->cUF = "43";
    $ide->tpAmb = "2";
    $ide->mod = "62";
    $ide->serie = "0";
    $ide->nNF = "12";
    $ide->cNF = "0000001";
    $ide->cDV = "6";
    $ide->dhEmi = "2024-02-01T09:30:29-03:00";
    $ide->tpEmis = "1";
    $ide->nSiteAutoriz = "0";
    $ide->cMunFG = "4303509";
    $ide->finNFCom = "0";
    $ide->tpFat = "0";
    $ide->verProc = "1.00";

    $infNFCom->emit = $emit;
    $emit->CNPJ = "07364617000135";
    $emit->IE = "0170108708";
    $emit->CRT = "3";
    $emit->xNome = "NS Tecnologia";

    $emit->enderEmit = $enderEmit;
    $enderEmit->xLgr = "RUA ANTONIO DURO";
    $enderEmit->nro = "870";
    $enderEmit->xBairro = "CENTRO";
    $enderEmit->cMun = "4303509";
    $enderEmit->xMun = "CAMAQUA";
    $enderEmit->CEP = "96180000";
    $enderEmit->UF = "RS";
    $enderEmit->fone = "5136719366";
    $enderEmit->email = "luciano.languer@nstecnologia.com.br";

    $infNFCom->dest = $dest;
    $dest->xNome = "NF-E EMITIDA EM AMBIENTE DE HOMOLOGACAO - SEM VALOR FISCAL";
    $dest->CPF = "00269925074";
    $dest->IE = "ISENTO";
    $dest->indIEDest = "2";

    $dest->enderDest = $enderDest;
    $enderDest->xLgr = "AV ANTONIO DURO";
    $enderDest->nro = "370";
    $enderDest->xBairro = "OLARIA";
    $enderDest->cMun = "4303509";
    $enderDest->xMun = "CAMAQUA";
    $enderDest->CEP = "96180000";
    $enderDest->UF = "RS";
    $enderDest->fone = "5136719366";
    $enderDest->email = "luciano.languer@nstecnologia.com.br";

    $infNFCom->assinante = $assinante;
    $assinante->iCodAssinante = "1234567890";
    $assinante->tpAssinante = "3";
    $assinante->tpServUtil = "4";
    $assinante->nContrato = "1234567890";
    $assinante->dContratoIni = "2024-01-29";
    $assinante->dContratoFim = "2024-12-31";

    $infNFCom->det = $det;
    $det->nItem = "1";
    $det->prod = $prod;
    $prod->cProd = "53";
    $prod->xProd = "Habilitação de TV por Assinatura";
    $prod->cClass = "0200301";
    $prod->CFOP = "5301";
    $prod->uMed = "2";
    $prod->qFaturada = "1";
    $prod->vItem = "115.00";
    $prod->vDesc = "0.00";
    $prod->vOutro = "0.00";
    $prod->vProd = "115.00";

    $det->imposto = $imposto;
    $imposto->ICMSSN = $icmssn;
    $icmssn->CST = "90";
    $icmssn->indSN = "1";

    $imposto->PIS = $pis;
    $pis->CST = "07";
    $pis->vBC = "0.00";
    $pis->pPIS = "0.00";
    $pis->vPIS = "0.00";

    $imposto->COFINS = $cofins;
    $cofins->CST = "07";
    $cofins->vBC = "0.00";
    $cofins->pCOFINS = "0.00";
    $cofins->vCOFINS = "0.00";

    $infNFCom->total = $total;
    $total->vProd = "115.00";
    $total->ICMSTot = $icmsTot;
    $icmsTot->vBC = "0.00";
    $icmsTot->vICMS = "0.00";
    $icmsTot->vICMSDeson = "0.00";
    $icmsTot->vFCP = "0.00";

    $infNFCom->gFat = $gFat;
    $gFat->CompetFat = "202402";
    $gFat->dVencFat = "2024-02-29";
    $gFat->dPerUsoIni = "2024-01-29";
    $gFat->dPerUsoFim = "2024-12-29";
    $gFat->codBarras = "432401073646170001356200000000000310000000101234";
    //Fim da criação do JSON

    //Declaração das variáveis que serão utilizadas como parâmetros
    $conteudo = json_encode($NFComJSON, JSON_UNESCAPED_UNICODE); //transformar conteúdo em JSON
    $tpConteudo  = "json";
    $cnpjEmit    = "07364617000135";
    $tpDown      = "XP";
    $tpAmb       = "2";
    $caminho     = "C:\\Users\\andriel.silva\\Desktop\\projetos andriel\\ns-suite-php-master-att\\Notas";
    $exibeNaTela = true;

    //Chamada da função para emitir
    $retorno = $NSSuite->emitirNFComSincrono($conteudo, $tpConteudo, $cnpjEmit, $tpDown, $tpAmb, $caminho, $exibeNaTela);
    $retorno = json_decode($retorno, true); //transformar retorno em json
    var_dump($retorno);//mostrar retorno
?>
