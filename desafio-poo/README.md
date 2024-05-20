# POO - DESAFIO

## Modelagem e Diagramação de um Componente iPhone

### Contexto

Elaborar a diagramação das classes e interfaces utilizando uma ferramenta UML de sua preferência. Em seguida, implemente as classes e interfaces no formato de arquivos .java.

```mermaid
classDiagram
     class ReprodutorMusical {
        <<interface>>
        +tocar()void
        +pausar()void
        +selecionarMusica(String musica)void
    }

    class AparelhoTelefonico {
        <<interface>>
        +ligar(String numero)void
        +atender()void
        +iniciarCorreioVoz()void
    }
    class NavegadorInternet {
        <<interface>>
        +exibirPagina(String url)void
        +adicionarNovaAba()void
        +atualizarPagina()void
    }

    iPhone --|> ReprodutorMusical
    iPhone --|> AparelhoTelefonico
    iPhone --|> NavegadorInternet
    
    ReprodutorMusical <|--Ipod
    ReprodutorMusical <|-- Mp3
    NavegadorInternet <|-- Chrome
    AparelhoTelefonico <|-- Telefone
```