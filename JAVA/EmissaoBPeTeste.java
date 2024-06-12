package br.eti.ns.nssuite;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson; //Biblioteca para a criação do JSON

import br.eti.ns.nssuite.JSON.BPe.BPeJSON;
import br.eti.ns.nssuite.JSON.BPe.BPeJSON.Agencia;
import br.eti.ns.nssuite.JSON.BPe.BPeJSON.BPe;
import br.eti.ns.nssuite.JSON.BPe.BPeJSON.Card;
import br.eti.ns.nssuite.JSON.BPe.BPeJSON.Comp;
import br.eti.ns.nssuite.JSON.BPe.BPeJSON.Emit;
import br.eti.ns.nssuite.JSON.BPe.BPeJSON.EnderAgencia;
import br.eti.ns.nssuite.JSON.BPe.BPeJSON.EnderComp;
import br.eti.ns.nssuite.JSON.BPe.BPeJSON.EnderEmit;
import br.eti.ns.nssuite.JSON.BPe.BPeJSON.ICMS;
import br.eti.ns.nssuite.JSON.BPe.BPeJSON.ICMS00;
import br.eti.ns.nssuite.JSON.BPe.BPeJSON.ICMSUFFim;
import br.eti.ns.nssuite.JSON.BPe.BPeJSON.Ide;
import br.eti.ns.nssuite.JSON.BPe.BPeJSON.Imp;
import br.eti.ns.nssuite.JSON.BPe.BPeJSON.InfBPe;
import br.eti.ns.nssuite.JSON.BPe.BPeJSON.InfPassageiro;
import br.eti.ns.nssuite.JSON.BPe.BPeJSON.InfPassagem;
import br.eti.ns.nssuite.JSON.BPe.BPeJSON.InfRespTec;
import br.eti.ns.nssuite.JSON.BPe.BPeJSON.InfValorBPe;
import br.eti.ns.nssuite.JSON.BPe.BPeJSON.InfViagem;
import br.eti.ns.nssuite.JSON.BPe.BPeJSON.InfBPe.Pag;


public class EmissaoBPeTeste {

    public static void main(String[] args) throws JsonProcessingException {

        //Declaração das variáveis utilizando as classes para montar o JSON
        NSSuite NSSuite = new NSSuite();
        BPeJSON BPeJSON = new BPeJSON();
        BPe bpe = new BPe();
        InfBPe infBPe = new InfBPe();
        Ide ide = new Ide();
        Emit emit = new Emit();
        EnderEmit enderEmit = new EnderEmit();
        Comp comp = new Comp();
        EnderComp enderComp = new EnderComp();
        Agencia agencia = new Agencia();
        EnderAgencia enderAgencia = new EnderAgencia();
        InfPassagem infPassagem = new InfPassagem();
        InfPassageiro infPassageiro = new InfPassageiro();
        InfViagem infViagem = new InfViagem();
        InfValorBPe infValorBPe = new InfValorBPe();
        Comp comp1 = new Comp();
        Comp comp2 = new Comp();
        List<Comp> compList = new ArrayList<>();
        compList.add(comp1);
        compList.add(comp2);
        Imp imp = new Imp();
        ICMS icms = new ICMS();
        ICMS00 icms00 = new ICMS00();
        ICMSUFFim icmsuffim = new ICMSUFFim();
        Pag pag = new Pag();
        Card card = new Card();
        InfRespTec infRespTec = new InfRespTec();

        //Inicio da criação do JSON
        BPeJSON.BPe = bpe;
        bpe.infBPe = infBPe;
        infBPe.versao = "1.00";

        infBPe.ide = ide;
        ide.cUF = "43";
        ide.cBP = "1";
        ide.tpAmb = "2";
        ide.mod = "63";
        ide.serie = "99";
        ide.nBP = "2";
        ide.cDV = "7";
        ide.modal = "1";
        ide.dhEmi = "2024-06-11T11:22:00-03:00";
        ide.tpEmis = "1";
        ide.verProc = "1.00";
        ide.tpBPe = "0";
        ide.indPres = "1";
        ide.UFIni = "RS";
        ide.cMunIni = "4314902";
        ide.UFFim = "PR";
        ide.cMunFim = "4106902";

        infBPe.emit = emit;
        emit.CNPJ = "07364617000135";
        emit.IE = "0170108708";
        emit.xNome = "POLITUR TRANSPORTE E AGÊNCIA DE TURISMO LTDA";
        emit.IM = "516830";
        emit.CNAE = "1234567";
        emit.CRT = "1";

        emit.enderEmit = enderEmit;
        enderEmit.xLgr = "RUA ANTONIO DURO";
        enderEmit.nro = "870";
        enderEmit.xBairro = "CENTRO";
        enderEmit.cMun = "4303509";
        enderEmit.xMun = "CAMAQUA";
        enderEmit.UF = "RS";

        emit.TAR = "113645236";

        infBPe.comp = comp;
        comp.xNome = "Francisco Edinardo Vieira dos Santos Filho";
        comp.CPF = "11111111111";

        comp.enderComp = enderComp;
        enderComp.xLgr = "RUA ANDRADAS EM CURITIBANAS";
        enderComp.nro = "870";
        enderComp.xBairro = "CENTRO";
        enderComp.cMun = "4106902";
        enderComp.xMun = "CURITIBA";
        enderComp.UF = "PR";

        infBPe.agencia = agencia;
        agencia.xNome = "AGENCIA LTDA";
        agencia.CNPJ = "07364617000135";

        agencia.enderAgencia = enderAgencia;
        enderAgencia.xLgr = "Largo Vespasiano Julio Veppo";
        enderAgencia.nro = "870";
        enderAgencia.xBairro = "CENTRO";
        enderAgencia.cMun = "4303509";
        enderAgencia.xMun = "CAMAQUA";
        enderAgencia.UF = "RS";

        infBPe.infPassagem = infPassagem;
        infPassagem.cLocOrig = "4314902";
        infPassagem.xLocOrig = "PORTO ALEGRE";
        infPassagem.cLocDest = "4106902";
        infPassagem.xLocDest = "CURITIBA";
        infPassagem.dhEmb = "2024-06-11T11:22:00-03:00";
        infPassagem.dhValidade = "2025-06-11T11:22:00-03:00";

        infPassagem.infPassageiro = infPassageiro;
        infPassageiro.xNome = "Rafael Dall Agnol Ecco";
        infPassageiro.tpDoc = "1";
        infPassageiro.nDoc = "03037398";

        infBPe.infViagem = infViagem;
        infViagem.cPercurso = "1";
        infViagem.xPercurso = "teste da descricao do percurso";
        infViagem.tpViagem = "00";
        infViagem.tpServ = "11";
        infViagem.tpAcomodacao = "1";
        infViagem.tpTrecho = "1";
        infViagem.dhViagem = "2024-06-11T10:15:00-03:00";
        infViagem.poltrona = "1";
        infViagem.prefixo = "0023";
        infViagem.plataforma = "3";

        infBPe.infValorBPe = infValorBPe;
        infValorBPe.vBP = "85.17";
        infValorBPe.vDesconto = "10.00";
        infValorBPe.tpDesconto = "01";
        infValorBPe.xDesconto = "TARIFA PROMOCIONAL";
        infValorBPe.vPgto = "75.17";
        infValorBPe.vTroco = "0.00";

        infValorBPe.Comp = compList;
        comp1.tpComp = "01";
        comp1.vComp = "65.17";
        comp2.tpComp = "03";
        comp2.vComp = "20.00";

        infBPe.imp = imp;
        imp.ICMS = icms;
        icms.ICMS00 = icms00;
        icms00.CST = "00";
        icms00.vBC = "85.17";
        icms00.pICMS = "10";
        icms00.vICMS = "8.51";

        imp.ICMSUFFim = icmsuffim;
        icmsuffim.vBCUFFim = "10.00";
        icmsuffim.pFCPUFFim = "0.85";
        icmsuffim.pICMSUFFim = "0.85";
        icmsuffim.pICMSInter = "0.85";
        icmsuffim.pICMSInterPart = "100";
        icmsuffim.vFCPUFFim = "1";
        icmsuffim.vICMSUFFim = "1";
        icmsuffim.vICMSUFIni = "1";

        infBPe.pag = pag;
        pag.tPag = "03";
        pag.vPag = "75.17";

        pag.card = card;
        card.tBand = "01";
        card.tpIntegra = "1";

        infBPe.infRespTec = infRespTec;
        infRespTec.CNPJ = "07364617000135";
        infRespTec.xContato = "Andriel";
        infRespTec.email = "andriel.silva@nstecnologia.com.br";
        infRespTec.fone = "5136921123";
        //Fim da criação do JSON

        //Utilizando a dependência para gerar o JSON
        Gson gson = new Gson();

        //Declarando as variáveis que vão ser utilizadas como parâmetros
        String conteudo = gson.toJson(BPeJSON); //Transformar o conteúdo em json
        String tpConteudo = "json";
        String cnpjEmit = "07364617000135";
        String tpDown = "XP";
        String tpAmb = "2";
        String caminho = "./Notas";
        Boolean exibeNaTela = true;  

        //Chamada da função para emissão sincrona
        try {
            String retorno = NSSuite.emitirBPeSincrono(conteudo, tpConteudo, cnpjEmit, tpDown, tpAmb, caminho, exibeNaTela);
                
            System.out.println("Retorno da emissao da CT-e:");
            
            System.out.println(retorno);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }  
}
