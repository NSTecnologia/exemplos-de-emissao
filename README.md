# exemplos-de-emissao

Utilizando estes exemplos de emissão, você irá conseguir gerar arquivos de emissão no formato JSON e enviálos para nossa API através das funções, passando-os como conteúdo.

### Integrando ao sistema:

Para utilizar esses exemplos de com as funções de comunicação com a API, você precisa realizar os seguintes passos:

1. Extraia o conteúdo da pasta compactada que você baixou;
2. Copie para sua aplicação a pasta src, na qual contem todos as classes que serão utilizadas;
3. Abra o seu projeto e importe a pasta copiada.

Pronto! Agora, você já pode consumir nossos exemplos através do seu sistema.

------

### Exemplos disponíveis:

**ATENÇÃO:** será necessário que você utilize os nossos exemplos de comunicação com a API para poder gerar os arquivos e comunicar de maneira efetiva, segue a baixo o tipo de documento fiscal e em qual linguagem possui o seu exemplo de emissão:

Tipos de documentos fiscais    | Linguagem
:-----------------------------:|:----------
BPe                            | Java e PHP
CTe                            | java e PHP
MDFe                           | Java e PHP
NFe                            | Java e PHP
NFCe                           | Java e PHP
NFCom                          | PHP


--------

### Transformação do conteúdo em JSON

#### JAVA:

##### Utilizando GSON:

        import com.google.gson.Gson;

        Gson gson = new Gson();
        String conteudo = gson.toJson(NFeJSON);

##### Utilizando JACKSON:

        import com.fasterxml.jackson.databind.ObjectMapper;

        ObjectMapper objectMapper = new ObjectMapper();
        String conteudo = objectMapper.writeValueAsString(NFeJSON);

#### PHP:

    $conteudo = json_encode($NFeJSON, JSON_UNESCAPED_UNICODE);

____


![Ns](https://nstecnologia.com.br/blog/wp-content/uploads/2018/11/ns%C2%B4tecnologia.png) | Obrigado pela atenção!
