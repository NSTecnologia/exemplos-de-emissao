package br.eti.ns.nssuite;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper; //Biblioteca para a criação do JSON através de objetos

import br.eti.ns.nssuite.JSON.NFe.NFeJSON;
import br.eti.ns.nssuite.JSON.NFe.NFeJSON.COFINS;
import br.eti.ns.nssuite.JSON.NFe.NFeJSON.COFINSAliq;
import br.eti.ns.nssuite.JSON.NFe.NFeJSON.Dest;
import br.eti.ns.nssuite.JSON.NFe.NFeJSON.Det;
import br.eti.ns.nssuite.JSON.NFe.NFeJSON.DetPag;
import br.eti.ns.nssuite.JSON.NFe.NFeJSON.Emit;
import br.eti.ns.nssuite.JSON.NFe.NFeJSON.EnderDest;
import br.eti.ns.nssuite.JSON.NFe.NFeJSON.EnderEmit;
import br.eti.ns.nssuite.JSON.NFe.NFeJSON.ICMS;
import br.eti.ns.nssuite.JSON.NFe.NFeJSON.ICMSSN102;
import br.eti.ns.nssuite.JSON.NFe.NFeJSON.ICMSTot;
import br.eti.ns.nssuite.JSON.NFe.NFeJSON.Ide;
import br.eti.ns.nssuite.JSON.NFe.NFeJSON.Imposto;
import br.eti.ns.nssuite.JSON.NFe.NFeJSON.InfNFe;
import br.eti.ns.nssuite.JSON.NFe.NFeJSON.InfRespTec;
import br.eti.ns.nssuite.JSON.NFe.NFeJSON.NFe;
import br.eti.ns.nssuite.JSON.NFe.NFeJSON.Pag;
import br.eti.ns.nssuite.JSON.NFe.NFeJSON.Prod;
import br.eti.ns.nssuite.JSON.NFe.NFeJSON.Total;
import br.eti.ns.nssuite.JSON.NFe.NFeJSON.Transp;

public class EmissaoNFCeTeste {

    public static void main(String[] args) throws JsonProcessingException {

        //Declaração das variáveis utilizando as classes para montar o JSON
        NSSuite NSSuite = new NSSuite();
        NFeJSON NFeJSON = new NFeJSON();
        NFe nfe = new NFe();
        InfNFe infNFe = new InfNFe();
        Ide ide = new Ide();
        Emit emit = new Emit();
        EnderEmit enderEmit = new EnderEmit();
        Dest dest = new Dest();
        EnderDest enderDest = new EnderDest();
        Det det1 = new Det();
        Det det2 = new Det();
        List<Det> detList = new ArrayList<>();
        detList.add(det1);
        detList.add(det2);
        Prod prod1 = new Prod();
        Prod prod2 = new Prod();
        Imposto imposto1 = new Imposto();
        Imposto imposto2 = new Imposto();
        ICMS icms = new ICMS();
        ICMSSN102 icmssn102 = new ICMSSN102();
        COFINS cofins = new COFINS();
        COFINSAliq cofinsAliq = new COFINSAliq();
        Total total = new Total();
        ICMSTot icmsTot = new ICMSTot();
        Transp transp = new Transp();
        Pag pag = new Pag();
        DetPag detPag1 = new DetPag();
        List<DetPag> detPag = new ArrayList<>();
        detPag.add(detPag1);
        InfRespTec infRespTec = new InfRespTec();
        ObjectMapper objectMapper = new ObjectMapper(); //classe para gerar o JSON

        //Inicio da criação do JSON
        NFeJSON.NFe = nfe; //Definir que o NFe está no NFEJSON
        nfe.infNFe = infNFe;
        infNFe.versao = "4.00";

        infNFe.ide = ide;
        ide.cUF = "43";
        ide.cNF = "";
        ide.natOp = "VENDA";
        ide.mod = "65";
        ide.serie = "99";
        ide.nNF = "118";
        ide.dhEmi = "2024-06-07T14:48:00-03:00";
        ide.tpNF = "1";
        ide.idDest = "1";
        ide.cMunFG = "4303509";
        ide.tpImp = "4";
        ide.tpEmis = "1";
        ide.cDV = "0";
        ide.tpAmb = "2";
        ide.finNFe = "1";
        ide.indFinal = "1";
        ide.indPres = "4";
        ide.indIntermed = "0";
        ide.procEmi = "0";
        ide.verProc = "1.0.0.0|NS_CLIENT";

        infNFe.emit = emit;
        emit.CNPJ = "07364617000135";
        emit.xNome = "NF-E EMITIDA EM AMBIENTE DE HOMOLOGACAO - SEM VALOR FISCAL";
        emit.IE = "0170108708";
        emit.CRT = "1";

        emit.enderEmit = enderEmit;
        enderEmit.xLgr = "AV ANTONIO DURO";
        enderEmit.nro = "0";
        enderEmit.xBairro = "OLARIA";
        enderEmit.cMun = "4303509";
        enderEmit.xMun = "CAMAQUA";
        enderEmit.UF = "RS";
        enderEmit.CEP = "96180000";
        enderEmit.cPais = "1058";
        enderEmit.xPais = "BRASIL";

        infNFe.dest = dest;
        dest.CPF = "02715522045";
        dest.xNome = "NF-E EMITIDA EM AMBIENTE DE HOMOLOGACAO - SEM VALOR FISCAL";
        dest.indIEDest = "9";
        dest.email = "email@email.com";

        dest.enderDest = enderDest;
        enderDest.xLgr = "AV MARFIM";
        enderDest.nro = "307";
        enderDest.xBairro = "INDUSTRIAL 2";
        enderDest.cMun = "3114204";
        enderDest.xMun = "CARMO DO CAJURO";
        enderDest.UF = "MG";
        enderDest.CEP = "35557000";
        enderDest.cPais = "1058";
        enderDest.xPais = "BRASIL";

        infNFe.det = detList;

        //Definir Produto 1
        det1.nItem = "1";
        det1.prod = prod1;
        prod1.cProd = "CL16";
        prod1.cEAN = "SEM GTIN";
        prod1.xProd = "NOTA FISCAL EMITIDA EM AMBIENTE DE HOMOLOGACAO - SEM VALOR FISCAL";
        prod1.NCM = "61034900";
        prod1.CFOP = "5102";
        prod1.uCom = "pc";
        prod1.qCom = "1";
        prod1.vUnCom = "69.00";
        prod1.vProd = "69.00";
        prod1.cEANTrib = "SEM GTIN";
        prod1.uTrib = "pc";
        prod1.qTrib = "1";
        prod1.vUnTrib = "69.00";
        prod1.indTot = "1";

        det1.imposto = imposto1;
        imposto1.vTotTrib = "69.00";

        imposto1.ICMS = icms;
        icms.ICMSSN102 = icmssn102;
        icmssn102.orig = "0";
        icmssn102.CSOSN = "102";

        imposto1.COFINS = cofins;
        cofins.COFINSAliq = cofinsAliq;
        cofinsAliq.CST = "01";
        cofinsAliq.vBC = "69";
        cofinsAliq.pCOFINS = "0";
        cofinsAliq.vCOFINS = "0.00";


        //Definir produto 2
        det2.nItem = "2";
        det2.prod = prod2;
        prod2.cProd = "CL17";
        prod2.cEAN = "SEM GTIN";
        prod2.xProd = "NOTA FISCAL EMITIDA EM AMBIENTE DE HOMOLOGACAO - SEM VALOR FISCAL";
        prod2.NCM = "61034900";
        prod2.CFOP = "5102";
        prod2.uCom = "pc";
        prod2.qCom = "1";
        prod2.vUnCom = "50.00";
        prod2.vProd = "50.00";
        prod2.cEANTrib = "SEM GTIN";
        prod2.uTrib = "pc";
        prod2.qTrib = "1";
        prod2.vUnTrib = "50.00";
        prod2.indTot = "1";
        prod2.nItemPed = "4145";

        det2.imposto = imposto2;
        imposto2.vTotTrib = "50.00";

        imposto2.ICMS = icms;
        icms.ICMSSN102 = icmssn102;
        icmssn102.orig = "0";
        icmssn102.CSOSN = "102";

        imposto2.COFINS = cofins;
        cofins.COFINSAliq = cofinsAliq;
        cofinsAliq.CST = "01";
        cofinsAliq.vBC = "50.00";
        cofinsAliq.pCOFINS = "0";
        cofinsAliq.vCOFINS = "0.00";

        infNFe.total = total;
        total.ICMSTot = icmsTot;
        icmsTot.vBC = "0.00";
        icmsTot.vICMS = "0.00";
        icmsTot.vICMSDeson = "0.00";
        icmsTot.vBCST = "0.00";
        icmsTot.vST = "0.00";
        icmsTot.vProd = "119.00";
        icmsTot.vFrete = "0.00";
        icmsTot.vSeg = "0.00";
        icmsTot.vFCP = "0.00";
        icmsTot.vFCPST = "0.00";
        icmsTot.vFCPSTRet = "0.00";
        icmsTot.vIPIDevol = "0.00";
        icmsTot.vDesc = "0.00";
        icmsTot.vII = "0.00";
        icmsTot.vIPI = "0.00";
        icmsTot.vPIS = "0.00";
        icmsTot.vCOFINS = "0.00";
        icmsTot.vOutro = "0.00";
        icmsTot.vTotTrib = "119.00";
        icmsTot.vNF = "119.00";

        infNFe.transp = transp;
        transp.modFrete = "9";

        infNFe.pag = pag;
        pag.vTroco = "1";
        pag.detPag = detPag;
        detPag1.indPag = "0";
        detPag1.tPag = "01";
        detPag1.vPag = "120.00";

        infNFe.infRespTec = infRespTec;    
        infRespTec.CNPJ = "07364617000135";
        infRespTec.xContato = "CONTATO";
        infRespTec.email = "email@email.com";
        infRespTec.fone = "13997206060";
        //Fim da criação do JSON

        //Declarando as variáveis que vão ser utilizadas como parâmetros
        String conteudo = objectMapper.writeValueAsString(NFeJSON);
        String tpConteudo = "json";
        String tpAmb = "2";
        String caminho = "./Notas";  
       
        //Chamada da função para emissão sincrona
        try{
        String retorno = NSSuite.emitirNFCeSincrono(conteudo, tpConteudo, tpAmb, caminho, true);
            
            // Exibição do retorno
            System.out.println("Retorno da emissao da NFC-e:");
            System.out.println(retorno);
        }catch (Exception e){
            e.printStackTrace();
        }
        
    }  
}
