package br.eti.ns.nssuite;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson; //Biblioteca para a criação do JSON

import br.eti.ns.nssuite.JSON.MDFe.MDFeJSON;
import br.eti.ns.nssuite.JSON.MDFe.MDFeJSON.Comp;
import br.eti.ns.nssuite.JSON.MDFe.MDFeJSON.Condutor;
import br.eti.ns.nssuite.JSON.MDFe.MDFeJSON.Disp;
import br.eti.ns.nssuite.JSON.MDFe.MDFeJSON.Emit;
import br.eti.ns.nssuite.JSON.MDFe.MDFeJSON.EnderEmit;
import br.eti.ns.nssuite.JSON.MDFe.MDFeJSON.Ide;
import br.eti.ns.nssuite.JSON.MDFe.MDFeJSON.InfANTT;
import br.eti.ns.nssuite.JSON.MDFe.MDFeJSON.InfBanc;
import br.eti.ns.nssuite.JSON.MDFe.MDFeJSON.InfCTe;
import br.eti.ns.nssuite.JSON.MDFe.MDFeJSON.InfContratante;
import br.eti.ns.nssuite.JSON.MDFe.MDFeJSON.InfDoc;
import br.eti.ns.nssuite.JSON.MDFe.MDFeJSON.InfLocalCarrega;
import br.eti.ns.nssuite.JSON.MDFe.MDFeJSON.InfLocalDescarrega;
import br.eti.ns.nssuite.JSON.MDFe.MDFeJSON.InfLotacao;
import br.eti.ns.nssuite.JSON.MDFe.MDFeJSON.InfMDFe;
import br.eti.ns.nssuite.JSON.MDFe.MDFeJSON.InfModal;
import br.eti.ns.nssuite.JSON.MDFe.MDFeJSON.InfMunCarrega;
import br.eti.ns.nssuite.JSON.MDFe.MDFeJSON.InfMunDescarga;
import br.eti.ns.nssuite.JSON.MDFe.MDFeJSON.InfPag;
import br.eti.ns.nssuite.JSON.MDFe.MDFeJSON.InfPercurso;
import br.eti.ns.nssuite.JSON.MDFe.MDFeJSON.InfPrazo;
import br.eti.ns.nssuite.JSON.MDFe.MDFeJSON.InfResp;
import br.eti.ns.nssuite.JSON.MDFe.MDFeJSON.InfSeg;
import br.eti.ns.nssuite.JSON.MDFe.MDFeJSON.MDFe;
import br.eti.ns.nssuite.JSON.MDFe.MDFeJSON.ProdPred;
import br.eti.ns.nssuite.JSON.MDFe.MDFeJSON.Rodo;
import br.eti.ns.nssuite.JSON.MDFe.MDFeJSON.Seg;
import br.eti.ns.nssuite.JSON.MDFe.MDFeJSON.Tot;
import br.eti.ns.nssuite.JSON.MDFe.MDFeJSON.ValePed;
import br.eti.ns.nssuite.JSON.MDFe.MDFeJSON.VeicTracao;

public class EmissaoMDFeTeste {

    public static void main(String[] args) throws JsonProcessingException {

        //Declaração das variáveis utilizando as classes para montar o JSON
        NSSuite NSSuite = new NSSuite();
        MDFeJSON MDFeJSON = new MDFeJSON();
        MDFe mdfe = new MDFe();
        InfMDFe infMDFe = new InfMDFe();
        Emit emit = new Emit();
        EnderEmit enderEmit = new EnderEmit();
        Ide ide = new Ide();
        InfMunCarrega infMunCarregaAux = new InfMunCarrega();
        List<InfMunCarrega> listInfMunCarrega = new ArrayList<>();
        listInfMunCarrega.add(infMunCarregaAux);
        InfPercurso infPercursoAux = new InfPercurso();
        List<InfPercurso> listInfPercurso = new ArrayList<>();
        listInfPercurso.add(infPercursoAux);
        InfDoc infDoc = new InfDoc();
        InfMunDescarga infMunDescarga = new InfMunDescarga();
        List<InfMunDescarga> listInfMunDescarga = new ArrayList<>();
        listInfMunDescarga.add(infMunDescarga);
        VeicTracao veicTracao = new VeicTracao();
        Condutor condutor = new Condutor();
        List<Condutor> listCondutor = new ArrayList<>();
        listCondutor.add(condutor);
        Tot tot = new Tot();
        Seg seg = new Seg();
        List<Seg> listSeg = new ArrayList<>();
        listSeg.add(seg);
        InfResp infResp = new InfResp();
        InfSeg infSeg = new InfSeg();
        ProdPred prodPred = new ProdPred();
        InfLotacao infLotacao = new InfLotacao();
        InfLocalCarrega infLocalCarrega = new InfLocalCarrega();
        InfLocalDescarrega infLocalDescarrega = new InfLocalDescarrega();
        InfCTe infCTe = new InfCTe();
        List<InfCTe> listCTe = new ArrayList<>();
        listCTe.add(infCTe);
        InfModal infModal = new InfModal();
        Rodo rodo = new Rodo();
        InfANTT infANTT = new InfANTT();
        ValePed valePed = new ValePed();
        Disp disp = new Disp();
        List<Disp> listDisp = new ArrayList<>();
        listDisp.add(disp);
        InfContratante infContratante = new InfContratante();
        List<InfContratante> listInfContratante = new ArrayList<>();
        listInfContratante.add(infContratante);
        InfPag infPag = new InfPag();
        Comp comp = new Comp();
        InfPrazo infPrazo = new InfPrazo();
        InfBanc infBanc = new InfBanc();

        //Inicio da criação do JSON
        MDFeJSON.MDFe = mdfe;
        mdfe.infMDFe = infMDFe;
        infMDFe.versao = "3.00";
        
        infMDFe.emit = emit;
        emit.CNPJ = "07364617000135";
        emit.IE = "0170108708";
        emit.xFant = "MDF-E EMITIDO EM AMBIENTE DE HOMOLOGACAO - SEM VALOR FISCAL";
        emit.xNome = "Emitente Teste";

        emit.enderEmit = enderEmit;
        enderEmit.CEP = "96180000";
        enderEmit.UF = "RS";
        enderEmit.cMun = "4303509";
        enderEmit.fone = "7532235542";
        enderEmit.nro = "0";
        enderEmit.xBairro = "Olaria";
        enderEmit.xLgr = "Anronio Duro";
        enderEmit.xMun = "Camaqua";

        infMDFe.ide = ide;
        ide.UFFim = "RS";
        ide.UFIni = "RS";
        ide.cUF = "43";
        ide.tpAmb = "2";
        ide.tpEmis = "1";
        ide.tpEmit = "1";
        ide.dhEmi = "2024-06-11T17:53:00-03:00";
        ide.mod = "58";
        ide.modal = "1";
        ide.nMDF = "3";
        ide.procEmi = "0";
        ide.serie = "99";
        ide.verProc = "1.00";
        ide.UFFim = "RS";
        ide.UFIni = "RS";
        ide.dhIniViagem = "2024-06-11T17:53:00-02:00";
        ide.infMunCarrega = listInfMunCarrega;
        infMunCarregaAux.cMunCarrega = "4304606";
        infMunCarregaAux.xMunCarrega = "Canoas";

        infMDFe.seg = listSeg;

        seg.infResp = infResp;
        infResp.respSeg = "1";
        infResp.CNPJ = "61573796000166";

        seg.infSeg = infSeg;
        infSeg.xSeg = "ALLIANZ SEGUROS S/A";
        infSeg.CNPJ = "61573796000166";

        seg.nApol = "98765431";
        seg.nAver = "321654987";

        infMDFe.prodPred = prodPred;
        prodPred.tpCarga = "01";
        prodPred.xProd = "Arroz";

        prodPred.infLotacao = infLotacao;
        
        infLotacao.infLocalCarrega = infLocalCarrega;
        infLocalCarrega.latitude = "-31.776000";
        infLocalCarrega.longitude = "-52.359400";

        infLotacao.infLocalDescarrega = infLocalDescarrega;
        infLocalDescarrega.latitude = "-31.776000";
        infLocalDescarrega.longitude = "-52.359400";

        infMDFe.infDoc = infDoc;
        infDoc.infMunDescarga = listInfMunDescarga;
        infMunDescarga.cMunDescarga = "4304606";
        infMunDescarga.xMunDescarga = "Canoas";
        infMunDescarga.infCTe = listCTe;
        infCTe.chCTe = "43240607364617000135570990000000051000009845";

        infMDFe.infModal = infModal;
        infModal.versaoModal = "3.00";
        infModal.rodo = rodo;

        rodo.infANTT = infANTT;
        infANTT.RNTRC = "03304621";

        infANTT.valePed = valePed;
        valePed.disp = listDisp;
        disp.CNPJForn = "04088208000165";
        disp.CNPJPg = "07364617000135";
        disp.nCompra = "100";
        disp.vValePed = "100";
        disp.tpValePed = "03";
        valePed.categCombVeic = "02";

        infANTT.infContratante = listInfContratante;
        infContratante.CNPJ = "07364617000135";

        infANTT.infPag = infPag;
        infPag.CNPJ = "07364617000135";
        infPag.Comp = comp;
        comp.tpComp = "99";
        comp.vComp = "1500";
        comp.xComp = "Teste";

        infPag.vContrato = "1500";
        infPag.indPag = "1";
        infPag.indAltoDesemp = "1";
        infPag.vAdiant = "500";

        infPag.infPrazo = infPrazo;
        infPrazo.nParcela = "001";
        infPrazo.dVenc = "2024-07-06";
        infPrazo.vParcela = "1000";

        infPag.infBanc = infBanc;
        infBanc.PIX = "+5551981494036";

        rodo.veicTracao = veicTracao;
        veicTracao.placa = "IIA6666";
        veicTracao.tara = "0";
        veicTracao.capKG = "10000";
        veicTracao.capM3 = "35";
        veicTracao.tpRod = "06";
        veicTracao.tpCar = "02";
        veicTracao.UF = "RS";
        veicTracao.condutor = listCondutor;
        condutor.xNome = "TESTE 1";
        condutor.CPF = "03991833026";

        infMDFe.tot = tot;
        tot.cUnid = "01";
        tot.qCTe = "1";
        tot.qCarga = "10000.0000";
        tot.qMDFe = "0";
        tot.qNFe = "0";
        tot.vCarga = "43.26";
        //Fim da criação do JSON

        Gson gson = new Gson(); //Classe para gerar o JSON

        //Declarando as variáveis que vão ser utilizadas como parâmetros
        String conteudo = gson.toJson(MDFeJSON); //Transformar o conteúdo em json
        String mod = "57";
        String tpConteudo = "json";
        String cnpjEmit = "07364617000135";
        String tpDown = "XP";
        String tpAmb = "2";
        String caminho = "./Notas";
        Boolean exibeNaTela = true;  

        //Chamada da função para emissão sincrona
        try {
            String retorno = NSSuite.emitirMDFeSincrono(conteudo, tpConteudo, cnpjEmit, tpDown, tpAmb, caminho, exibeNaTela);
                
            System.out.println("Retorno da emissao da CT-e:");
            
            System.out.println(retorno);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
