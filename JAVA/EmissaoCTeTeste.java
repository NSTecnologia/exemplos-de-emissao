package br.eti.ns.nssuite;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson; //Biblioteca para a criação do JSON

import br.eti.ns.nssuite.JSON.CTe.CTeJSON;
import br.eti.ns.nssuite.JSON.CTe.CTeJSON.CTe;
import br.eti.ns.nssuite.JSON.CTe.CTeJSON.Comp;
import br.eti.ns.nssuite.JSON.CTe.CTeJSON.Compl;
import br.eti.ns.nssuite.JSON.CTe.CTeJSON.Dest;
import br.eti.ns.nssuite.JSON.CTe.CTeJSON.Emit;
import br.eti.ns.nssuite.JSON.CTe.CTeJSON.EnderDest;
import br.eti.ns.nssuite.JSON.CTe.CTeJSON.EnderEmit;
import br.eti.ns.nssuite.JSON.CTe.CTeJSON.EnderReme;
import br.eti.ns.nssuite.JSON.CTe.CTeJSON.ICMS;
import br.eti.ns.nssuite.JSON.CTe.CTeJSON.ICMSSN;
import br.eti.ns.nssuite.JSON.CTe.CTeJSON.Ide;
import br.eti.ns.nssuite.JSON.CTe.CTeJSON.Imp;
import br.eti.ns.nssuite.JSON.CTe.CTeJSON.InfCTeNorm;
import br.eti.ns.nssuite.JSON.CTe.CTeJSON.InfCarga;
import br.eti.ns.nssuite.JSON.CTe.CTeJSON.InfCte;
import br.eti.ns.nssuite.JSON.CTe.CTeJSON.InfDoc;
import br.eti.ns.nssuite.JSON.CTe.CTeJSON.InfModal;
import br.eti.ns.nssuite.JSON.CTe.CTeJSON.InfNFe;
import br.eti.ns.nssuite.JSON.CTe.CTeJSON.InfQ;
import br.eti.ns.nssuite.JSON.CTe.CTeJSON.InfRespTec;
import br.eti.ns.nssuite.JSON.CTe.CTeJSON.ObsCont;
import br.eti.ns.nssuite.JSON.CTe.CTeJSON.Rem;
import br.eti.ns.nssuite.JSON.CTe.CTeJSON.Rodo;
import br.eti.ns.nssuite.JSON.CTe.CTeJSON.Toma3;
import br.eti.ns.nssuite.JSON.CTe.CTeJSON.VPrest;

public class EmissaoCTeTeste {

    public static void main(String[] args) throws JsonProcessingException {

        //Declaração das variáveis utilizando as classes para montar o JSON
        NSSuite NSSuite = new NSSuite();
        CTeJSON CTeJSON = new CTeJSON();
        CTe cte = new CTe();
        InfCte infCte = new InfCte();
        Ide ide = new Ide();
        Compl compl = new Compl();
        ObsCont obsCont = new ObsCont();
        Emit emit = new Emit();
        EnderEmit enderEmit = new EnderEmit();
        Rem rem = new Rem();
        EnderReme enderReme = new EnderReme();
        Dest dest = new Dest();
        EnderDest enderDest = new EnderDest();
        VPrest vPrest = new VPrest();
        Comp comp1 = new Comp();
        Comp comp2 = new Comp();
        List<Comp> comp = new ArrayList<>();
        comp.add(comp1);
        comp.add(comp2);
        Imp imp = new Imp();
        ICMS icms = new ICMS();
        ICMSSN icmssn = new ICMSSN();
        InfCTeNorm infCTeNorm = new InfCTeNorm();
        InfCarga infCarga = new InfCarga();
        InfQ infQ1 = new InfQ();
        List<InfQ> infQ = new ArrayList<>();
        infQ.add(infQ1);
        InfDoc infDoc = new InfDoc();
        InfNFe infNFe1 = new InfNFe();
        List<InfNFe> infNFe = new ArrayList<>();
        infNFe.add(infNFe1);
        InfRespTec infRespTec = new InfRespTec();
        InfModal infModal = new InfModal();
        Rodo rodo = new Rodo();
        Toma3 toma3 = new Toma3();
        
        Gson gson = new Gson(); //Classe para gerar o JSON

        //Inicio da criação do JSON
        CTeJSON.CTe = cte;
        cte.infCte = infCte;
        infCte.versao = "4.00";

        infCte.ide = ide;
        ide.cUF = "43";
        ide.cCT = "00000984";
        ide.CFOP = "5353";
        ide.natOp = "SERVICO DE TRANSPORTE";
        ide.mod = "57";
        ide.serie = "99";
        ide.nCT = "1";
        ide.dhEmi = "2024-06-10T10:27:05-03:00";
        ide.tpImp = "2";
        ide.tpEmis = "1";
        ide.cDV = "4";
        ide.tpAmb = "2";
        ide.tpCTe = "0";
        ide.procEmi = "0";
        ide.verProc = "1.02|NS_API";
        ide.cMunEnv = "4303509";
        ide.xMunEnv = "CAMAQUA";
        ide.UFEnv = "RS";
        ide.modal = "01";
        ide.tpServ = "0";
        ide.cMunIni = "4303509";
        ide.xMunIni = "CAMAQUA";
        ide.UFIni = "RS";
        ide.UFFim = "RS";
        ide.cMunFim = "4303509";
        ide.xMunFim = "CAMAQUA";
        ide.UFFim = "RS";
        ide.retira = "1";
        ide.indIEToma = "1";
        ide.toma3 = toma3;
        toma3.toma = "3";
        
        infCte.compl = compl;
        compl.ObsCont = obsCont;
        obsCont.xTexto = "andrielxsilva@gmail.com";
        obsCont.xCampo = "enviarEmail";

        infCte.emit = emit;
        emit.CNPJ = "07364617000135";
        emit.IE = "0170108708";
        emit.xNome = "NEWS SYSTEMS LTDA";
        emit.CRT = "1";
        emit.xFant = "teste";

        emit.enderEmit = enderEmit;
        enderEmit.xLgr = "ROD RST 470 KM 221 BLOCO A";
        enderEmit.nro = ".";
        enderEmit.xBairro = "GARIBALDINA";
        enderEmit.cMun = "4308607";
        enderEmit.xMun = "GARIBALDI";
        enderEmit.CEP = "95720000";
        enderEmit.UF = "RS";
        enderEmit.fone = "5434638266";

        infCte.rem = rem;
        rem.CPF = "01229452044";
        rem.xNome = "CTE EMITIDO EM AMBIENTE DE HOMOLOGACAO - SEM VALOR FISCAL";
        rem.xFant = "andriel silva";
        rem.fone = "1939356598";

        rem.enderReme = enderReme;
        enderReme.xLgr = "Estrada General Motors";
        enderReme.nro = "852";
        enderReme.xCpl = "Gp 17/18";
        enderReme.xBairro = "B. Caldeira";
        enderReme.cMun = "3520509";
        enderReme.xMun = "Indaiatuba";
        enderReme.CEP = "13347500";
        enderReme.UF = "SP";
        enderReme.cPais = "1058";
        enderReme.xPais = "Brasil";

        infCte.dest = dest;
        dest.CNPJ = "07364617000135";
        dest.IE = "0170108708";
        dest.xNome = "CTE EMITIDO EM AMBIENTE DE HOMOLOGACAO - SEM VALOR FISCAL";

        dest.enderDest = enderDest;
        enderDest.xLgr = "FAZENDA";
        enderDest.nro = "S/N";
        enderDest.xBairro = "ZONA RURAL";
        enderDest.cMun = "4303509";
        enderDest.xMun = "CAMAQUA";
        enderDest.UF = "RS";
        enderDest.cPais = "1058";
        enderDest.xPais = "BRASIL";

        infCte.vPrest = vPrest;
        vPrest.vTPrest = "440.00";
        vPrest.vRec = "440.00";
        vPrest.comp = comp;
        comp1.xNome = "Valor da viagem";
        comp1.vComp = "396.00";
        comp2.xNome = "Valor do Seguro";
        comp2.vComp = "44.00";

        infCte.imp = imp;
        imp.ICMS = icms;
        icms.ICMSSN = icmssn;
        icmssn.CST = "90";
        icmssn.indSN = "1";

        infCte.infCTeNorm = infCTeNorm;
        infCTeNorm.infCarga = infCarga;
        infCarga.vCarga = "2200.00";
        infCarga.proPred = "Maquina rebitaeira";
        infCarga.vCargaAverb = "22000.00";
        infCarga.infQ = infQ;
        infQ1.cUnid = "01";
        infQ1.tpMed = "Peso Bruto";
        infQ1.qCarga = "380.0000";

        infCTeNorm.infDoc = infDoc;
        infDoc.infNFe = infNFe;
        infNFe1.chave = "43240607364617000135550990000000636985829463";

        cte.infRespTec = infRespTec;
        infRespTec.cnpj = "07364617000135";
        infRespTec.xContato = "Andriel";
        infRespTec.email = "andriel.silva@nstecnologia.com.br";
        infRespTec.fone = "5136921123";
        
        CTeJSON.infModal = infModal;
        infModal.versaoModal = "4.00";
        infModal.rodo = rodo;
        rodo.RNTRC = "04023389";
        //Fim da criação do JSON

        //Declarando as variáveis que vão ser utilizadas como parâmetros
        String conteudo = gson.toJson(CTeJSON); //Transformar o conteúdo em json
        String mod = "57";
        String tpConteudo = "json";
        String cnpjEmit = "07364617000135";
        String tpDown = "XP";
        String tpAmb = "2";
        String caminho = "./Notas";
        Boolean exibeNaTela = true;  

        //Chamada da função para emissão sincrona
        try {
            String retorno = NSSuite.emitirCTeSincrono(conteudo, mod ,tpConteudo, cnpjEmit, tpDown, tpAmb, caminho, exibeNaTela);
                
            System.out.println("Retorno da emissao da CT-e:");
            
            System.out.println(retorno);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }  
}
