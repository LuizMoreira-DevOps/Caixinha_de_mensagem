# Caixinha da Cami

Aplicativo Android desenvolvido em Kotlin como um presente digital personalizado.

A **Caixinha da Cami** é uma versão mobile de uma caixinha de mensagens afetivas. A ideia é permitir que a pessoa escolha uma gavetinha e tire um “papelzinho” virtual com uma mensagem especial, como se fosse uma lembrança guardada com carinho.

O projeto foi criado com uma proposta simples, emocional e funcional: transformar frases, passagens bíblicas, citações, referências de filmes, músicas e mensagens pessoais em uma experiência leve e interativa.

## ✨ Funcionalidades

* Sorteio aleatório de mensagens.
* Três categorias principais de mensagens.
* Exibição de título, tipo, gaveta e conteúdo da mensagem.
* Animação suave ao revelar cada papelzinho.
* Interface simples, romântica e personalizada.
* Funcionamento local, sem necessidade de internet.
* Projeto nativo Android usando Kotlin e XML.

## 📦 Gavetas de mensagens

O aplicativo possui três gavetas principais:

### 1. Leia quando precisar

Mensagens voltadas para momentos de cansaço, medo, ansiedade ou necessidade de encorajamento.

Inclui:

* Passagens da Bíblia.
* Citações inspiradoras.
* Mensagens de motivação.
* Frases de apoio emocional.

### 2. O que eu gosto em você

Mensagens pessoais sobre características, detalhes e qualidades da Cami.

Inclui frases sobre:

* Cuidado.
* Sensibilidade.
* Fé.
* Coragem.
* Jeito de amar.
* Presença.
* Maternidade.
* Força nos dias difíceis.

### 3. Seu lugar no meu universo

Mensagens com referências a filmes, séries, personagens e frases marcantes.

Inclui referências de:

* O Rei Leão.
* O Senhor dos Anéis.
* Harry Potter.
* Guardiões da Galáxia.
* The Big Bang Theory.
* Piratas do Caribe.
* Tarzan.
* Alice no País das Maravilhas.
* Hércules.
* Filmes de romance.
* Disney, Pixar, Marvel, fantasia e cultura geek.

## 🛠️ Tecnologias utilizadas

* Kotlin
* Android SDK
* XML Layouts
* AppCompat
* Gradle
* Android Studio

## 📁 Estrutura principal

```text
app/
 └── src/
     └── main/
         ├── java/
         │   └── com/
         │       └── caixinha/
         │           └── de_mensagem/
         │               └── MainActivity.kt
         ├── res/
         │   └── layout/
         │       └── activity_main.xml
         └── AndroidManifest.xml
```

## 🧠 Como funciona

O app usa uma classe de dados chamada `Mensagem`, responsável por armazenar as informações de cada papelzinho:

```kotlin
data class Mensagem(
    val gaveta: String,
    val tipo: String,
    val titulo: String,
    val texto: String
)
```

Cada categoria possui uma lista de mensagens. Quando o usuário toca em um botão, o aplicativo sorteia uma mensagem da lista correspondente usando `Random`.

Exemplo:

```kotlin
private fun sortearMensagem(lista: List<Mensagem>) {
    val mensagem = lista[Random.nextInt(lista.size)]

    txtGaveta.text = mensagem.gaveta
    txtTipo.text = mensagem.tipo
    txtTituloMensagem.text = mensagem.titulo
    txtMensagem.text = mensagem.texto

    animarCard()
}
```

Depois do sorteio, o card da mensagem recebe uma animação simples para dar a sensação de que um novo papelzinho foi retirado da caixinha.

## ▶️ Como executar o projeto

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
```

2. Abra o projeto no Android Studio.

3. Aguarde a sincronização do Gradle.

4. Conecte um dispositivo Android ou inicie um emulador.

5. Clique em **Run**.

## 🔄 CI/CD

O projeto pode utilizar GitHub Actions para validar o build automaticamente a cada push ou pull request.

O workflow sugerido fica em:

```text
.github/workflows/android-ci.yml
```

Ele executa:

* Checkout do repositório.
* Configuração do Java.
* Permissão para o Gradle Wrapper.
* Build do APK debug.
* Testes unitários.

## 🚧 Próximas melhorias

Ideias planejadas para versões futuras:

* Ajustar frases pessoais para ficarem ainda mais íntimas.
* Adicionar uma gaveta de músicas com valor emocional.
* Melhorar a paleta de cores.
* Refinar o layout visual.
* Adicionar ícones aos botões.
* Criar botão para “sortear outro papelzinho”.
* Criar botão para copiar mensagem.
* Criar uma tela inicial mais personalizada.
* Adicionar efeitos visuais de papel ou envelope.
* Separar as mensagens em arquivos próprios para facilitar manutenção.

## 🎵 Ideia para próxima versão

Uma possível nova gaveta:

```text
Trilha sonora de nós
```

Ela pode incluir músicas importantes para o casal, com uma pequena explicação afetiva sobre cada uma.

Exemplo:

```kotlin
Mensagem(
    gaveta = "Trilha sonora de nós",
    tipo = "Música",
    titulo = "You'll Never Walk Alone",
    texto = "Porque quando o caminho apertar, eu quero que você lembre: você nunca caminha sozinha."
)
```

## ❤️ Sobre o projeto

Este app não foi pensado apenas como um exercício técnico. Ele é um presente.

A proposta é juntar tecnologia, memória, fé, humor, referências geek, romantismo e cuidado em uma experiência simples: tocar em uma gavetinha e receber uma mensagem que abraça.

Feito por Luiz, com amor.
