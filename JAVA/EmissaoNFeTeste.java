package br.eti.ns.nssuite;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson; //Biblioteca para a criação do JSON


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
import br.eti.ns.nssuite.JSON.NFe.NFeJSON.IPI;
import br.eti.ns.nssuite.JSON.NFe.NFeJSON.IPINT;
import br.eti.ns.nssuite.JSON.NFe.NFeJSON.Ide;
import br.eti.ns.nssuite.JSON.NFe.NFeJSON.Imposto;
import br.eti.ns.nssuite.JSON.NFe.NFeJSON.InfAdic;
import br.eti.ns.nssuite.JSON.NFe.NFeJSON.InfNFe;
import br.eti.ns.nssuite.JSON.NFe.NFeJSON.NFe;
import br.eti.ns.nssuite.JSON.NFe.NFeJSON.PIS;
import br.eti.ns.nssuite.JSON.NFe.NFeJSON.PISAliq;
import br.eti.ns.nssuite.JSON.NFe.NFeJSON.Pag;
import br.eti.ns.nssuite.JSON.NFe.NFeJSON.Prod;
import br.eti.ns.nssuite.JSON.NFe.NFeJSON.Total;
import br.eti.ns.nssuite.JSON.NFe.NFeJSON.Transp;

public class EmissaoNFeTeste {

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
        List<Det> detList = new ArrayList<>();
        detList.add(det1);
        Prod prod1 = new Prod();
        Imposto imposto1 = new Imposto();  
        ICMS icms = new ICMS();
        ICMSSN102 icmssn102 = new ICMSSN102();
        IPI ipi = new IPI();
        IPINT ipint = new IPINT();
        PIS pis = new PIS();
        PISAliq pisAliq = new PISAliq();
        COFINS cofins = new COFINS();
        COFINSAliq cofinsAliq = new COFINSAliq();
        Total total = new Total();
        ICMSTot icmsTot = new ICMSTot();
        Transp transp = new Transp();
        Pag pag = new Pag();
        DetPag detPag1 = new DetPag();
        List<DetPag> detPag = new ArrayList<>();
        detPag.add(detPag1);
        InfAdic infAdic = new InfAdic();

        Gson gson = new Gson(); //Classe para gerar o JSON

        //Inicio da criação do JSON
        NFeJSON.NFe = nfe; //Definir que o NFe está no NFEJSON
        nfe.infNFe = infNFe;
        infNFe.versao = "4.00";

        infNFe.ide = ide;
        ide.cUF = "43";
        ide.cNF = "";
        ide.natOp = "VENDA A PRAZO - SEM VALOR FISCAL";
        ide.mod = "55";
        ide.serie = "99";
        ide.nNF = "56";
        ide.dhEmi = "2024-06-06T11:54:00-03:00";
        ide.tpNF = "1";
        ide.idDest = "1";
        ide.cMunFG = "4303509";
        ide.tpImp = "1";
        ide.tpEmis = "6";
        ide.cDV = "6";
        ide.tpAmb = "2";
        ide.finNFe = "1";
        ide.indFinal = "0";
        ide.indPres = "9";
        ide.indIntermed = "0";
        ide.procEmi = "0";
        ide.verProc = "4.00";

        infNFe.emit = emit;
        emit.CNPJ = "07364617000135";
        emit.xNome = "NF-E EMITIDA EM AMBIENTE DE HOMOLOGACAO - SEM VALOR FISCAL";
        emit.IE = "0170108708";
        emit.CRT = "1";

        emit.enderEmit = enderEmit;
        enderEmit.xLgr = "Rua Bento Osvaldo Trisch";
        enderEmit.nro = "777";
        enderEmit.xCpl = "CX POSTAL 91";
        enderEmit.xBairro = "Pendancino";
        enderEmit.cMun = "4303509";
        enderEmit.xMun = "CAXIAS DO SUL";
        enderEmit.UF = "RS";
        enderEmit.CEP = "96180000";
        enderEmit.fone = "5432200200";

        infNFe.dest = dest;
        dest.CNPJ = "07364617000135";
        dest.xNome = "NF-E EMITIDA EM AMBIENTE DE HOMOLOGACAO - SEM VALOR FISCAL";
        dest.IE = "0170108708";
        dest.indIEDest = "1";
        dest.email = "email@email.com";

        dest.enderDest = enderDest;
        enderDest.xLgr = "AV ANTONIO DURO";
        enderDest.nro = "0";
        enderDest.xBairro = "OLARIA";
        enderDest.cMun = "4303509";
        enderDest.xMun = "CAMAQUA";
        enderDest.UF = "RS";
        enderDest.CEP = "96180000";
        enderDest.cPais = "1058";
        enderDest.xPais = "BRASIL";

        infNFe.det = detList;

        //Definir Produto 1
        det1.nItem = "1";
        det1.prod = prod1;
        prod1.cEAN = "SEM GTIN";
        prod1.cEANTrib = "SEM GTIN";
        prod1.cProd = "123456789";
        prod1.xProd = "COCA-COLA LT 250 ML";
        prod1.NCM = "22021000";
        prod1.CEST = "0301100";
        prod1.CFOP = "5101";
        prod1.uCom = "UN";
        prod1.qCom = "1.0000";
        prod1.vUnCom = "3.00";
        prod1.vProd = "3.00";
        prod1.uTrib = "UN";
        prod1.qTrib = "1.000";
        prod1.vUnTrib = "3.00";
        prod1.indTot = "1";
        prod1.nItemPed = "0";

        det1.imposto = imposto1;
        imposto1.vTotTrib = "0.00";

        imposto1.ICMS = icms;
        icms.ICMSSN102 = icmssn102;
        icmssn102.orig = "0";
        icmssn102.CSOSN = "102";

        imposto1.IPI = ipi;
        ipi.cEnq = "999";
        ipi.IPINT = ipint;
        ipint.CST = "53";

        imposto1.PIS = pis;
        pis.PISAliq = pisAliq;
        pisAliq.CST = "01";
        pisAliq.vBC = "3.00";
        pisAliq.pPIS = "1.65";
        pisAliq.vPIS = "0.05";

        imposto1.COFINS = cofins;
        cofins.COFINSAliq = cofinsAliq;
        cofinsAliq.CST = "01";
        cofinsAliq.vBC = "3.00";
        cofinsAliq.pCOFINS = "7.00";
        cofinsAliq.vCOFINS = "0.21";

        infNFe.total = total;
        total.ICMSTot = icmsTot;
        icmsTot.vBC = "0.00";
        icmsTot.vICMS = "0.00";
        icmsTot.vICMSDeson = "0.00";
        icmsTot.vFCPUFDest = "0.00";
        icmsTot.vICMSUFDest = "0.00";
        icmsTot.vICMSUFRemet = "0.00";
        icmsTot.vFCP = "0.00";
        icmsTot.vBCST = "0.00";
        icmsTot.vST = "0.00";
        icmsTot.vFCPST = "0.00";
        icmsTot.vFCPSTRet = "0.00";
        icmsTot.vProd = "3.00";
        icmsTot.vFrete = "0.00";
        icmsTot.vSeg = "0.00";
        icmsTot.vDesc = "0.00";
        icmsTot.vII = "0.00";
        icmsTot.vIPI = "0.00";
        icmsTot.vIPIDevol = "0.00";
        icmsTot.vPIS = "0.05";
        icmsTot.vCOFINS = "0.21";
        icmsTot.vOutro = "0.00";
        icmsTot.vNF = "3.00";
        icmsTot.vTotTrib = "0.00";

        infNFe.transp = transp;
        transp.modFrete = "9";

        infNFe.pag = pag;
        pag.vTroco = "2.00";
        pag.detPag = detPag;
        detPag1.tPag = "16";
        detPag1.vPag = "5.00";

        infNFe.infAdic = infAdic;
        infAdic.infCpl = "DESCONTO PIS 0,01 COFINS 0,06 LEI 11.196 DE 21/11/2005";
        //Fim da criação do JSON


        //Declarando as variáveis que vão ser utilizadas como parâmetros
        String conteudo = gson.toJson(NFeJSON); //Transformar o conteúdo em json
        String tpConteudo = "json";
        String cnpjEmit = "07364617000135";
        String tpDown = "XP";
        String tpAmb = "2";
        String caminho = "./Notas";
        Boolean exibeNaTela = true;  

        //Chamada da função para emissão sincrona
        try {
            String retorno = NSSuite.emitirNFeSincrono(conteudo, tpConteudo, cnpjEmit, tpDown, tpAmb, caminho, exibeNaTela);
                
            System.out.println("Retorno da emissao da NF-e:");
            
            System.out.println(retorno);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }  
}
