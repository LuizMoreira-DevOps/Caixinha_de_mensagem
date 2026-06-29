package com.caixinha.de_mensagem

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

data class Mensagem(
    val gaveta: String,
    val tipo: String,
    val titulo: String,
    val texto: String
)

class MainActivity : AppCompatActivity() {

    private lateinit var txtGaveta: TextView
    private lateinit var txtTipo: TextView
    private lateinit var txtTituloMensagem: TextView
    private lateinit var txtMensagem: TextView
    private lateinit var cardMensagem: LinearLayout

    private lateinit var btnLeiaQuandoPrecisar: Button
    private lateinit var btnOQueGosto: Button
    private lateinit var btnUniverso: Button
    private lateinit var btnMusicas: Button

    private val mensagensLeiaQuandoPrecisar = listOf(
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Passagem da Bíblia",
            titulo = "Quando o medo vier",
            texto = "Não temas, porque eu sou contigo; não te assombres, porque eu sou o teu Deus; eu te esforço, e te ajudo, e te sustento com a destra da minha justiça. Isaías 41:10."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Passagem da Bíblia",
            titulo = "Descanso para o coração",
            texto = "Vinde a mim, todos os que estais cansados e oprimidos, e eu vos aliviarei. Mateus 11:28."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Passagem da Bíblia",
            titulo = "Entregue seus pesos",
            texto = "Lançando sobre ele toda a vossa ansiedade, porque ele tem cuidado de vós. 1 Pedro 5:7."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Passagem da Bíblia",
            titulo = "Deus caminha contigo",
            texto = "Esforça-te, e tem bom ânimo; não temas, nem te espantes; porque o Senhor teu Deus é contigo, por onde quer que andares. Josué 1:9."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Passagem da Bíblia",
            titulo = "Paz no meio do barulho",
            texto = "Deixo-vos a paz, a minha paz vos dou; não vo-la dou como o mundo a dá. Não se turbe o vosso coração, nem se atemorize. João 14:27."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Passagem da Bíblia",
            titulo = "Abrigo seguro",
            texto = "Aquele que habita no esconderijo do Altíssimo, à sombra do Onipotente descansará. Direi do Senhor: Ele é o meu Deus, o meu refúgio, a minha fortaleza, e nele confiarei. Salmo 91:1-2."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Passagem da Bíblia",
            titulo = "Deus está perto",
            texto = "Perto está o Senhor dos que têm o coração quebrantado, e salva os contritos de espírito. Salmo 34:18."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Passagem da Bíblia",
            titulo = "Um dia de cada vez",
            texto = "Não vos inquieteis, pois, pelo dia de amanhã, porque o dia de amanhã cuidará de si mesmo. Basta a cada dia o seu mal. Mateus 6:34."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Passagem da Bíblia",
            titulo = "Forças renovadas",
            texto = "Mas os que esperam no Senhor renovarão as suas forças; subirão com asas como águias; correrão, e não se cansarão; caminharão, e não se fatigarão. Isaías 40:31."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Passagem da Bíblia",
            titulo = "Deus cuida dos detalhes",
            texto = "Olhai para as aves do céu, que nem semeiam, nem segam, nem ajuntam em celeiros; e vosso Pai celestial as alimenta. Não tendes vós muito mais valor do que elas? Mateus 6:26."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Passagem da Bíblia",
            titulo = "Amor que não solta",
            texto = "Porque estou certo de que, nem a morte, nem a vida, nem os anjos, nem os principados, nem as potestades, nem o presente, nem o porvir, nos poderá separar do amor de Deus. Romanos 8:38-39."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Passagem da Bíblia",
            titulo = "Luz para o caminho",
            texto = "Lâmpada para os meus pés é tua palavra, e luz para o meu caminho. Salmo 119:105."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Passagem da Bíblia",
            titulo = "Deus sustenta",
            texto = "Lança o teu cuidado sobre o Senhor, e ele te susterá; nunca permitirá que o justo seja abalado. Salmo 55:22."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Passagem da Bíblia",
            titulo = "Alma restaurada",
            texto = "O Senhor é o meu pastor, nada me faltará. Deitar-me faz em verdes pastos, guia-me mansamente a águas tranquilas. Refrigera a minha alma. Salmo 23:1-3."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Passagem da Bíblia",
            titulo = "Futuro de paz",
            texto = "Porque eu bem sei os pensamentos que penso de vós, diz o Senhor; pensamentos de paz, e não de mal, para vos dar o fim que esperais. Jeremias 29:11."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Citação",
            titulo = "O primeiro passo",
            texto = "Você não precisa ver a escada inteira. Apenas dê o primeiro passo. Martin Luther King Jr."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Citação",
            titulo = "Pequenas coisas",
            texto = "Nem sempre podemos fazer grandes coisas, mas podemos fazer pequenas coisas com grande amor. Madre Teresa de Calcutá."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Citação",
            titulo = "Novo caminho",
            texto = "Você nunca é velho demais para definir um novo objetivo ou sonhar um novo sonho. C. S. Lewis."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Citação",
            titulo = "Faça o possível",
            texto = "Faça o que puder, com o que tiver, onde estiver. Theodore Roosevelt."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Citação",
            titulo = "Gentileza também é força",
            texto = "De um modo gentil, você pode sacudir o mundo. Mahatma Gandhi."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Citação",
            titulo = "Oportunidade escondida",
            texto = "No meio da dificuldade encontra-se a oportunidade. Albert Einstein."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Citação",
            titulo = "Começar pequeno",
            texto = "O jeito de começar é parar de falar e começar a fazer. Walt Disney."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Citação",
            titulo = "A alma grande",
            texto = "Tudo vale a pena quando a alma não é pequena. Fernando Pessoa."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Citação",
            titulo = "O essencial",
            texto = "O essencial é invisível aos olhos. Antoine de Saint-Exupéry."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Citação",
            titulo = "Continue caminhando",
            texto = "A coragem nem sempre ruge. Às vezes, coragem é a voz calma no fim do dia dizendo: amanhã eu tento de novo. Mary Anne Radmacher."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Citação",
            titulo = "O tempo que nos é dado",
            texto = "Tudo que temos de decidir é o que fazer com o tempo que nos é dado. J.R.R. Tolkien."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Citação",
            titulo = "Nem todo caminho é perda",
            texto = "Nem todos os que vagueiam estão perdidos. J.R.R. Tolkien."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Citação",
            titulo = "Raízes profundas",
            texto = "O velho que é forte não murcha; raízes profundas não são alcançadas pela geada. J.R.R. Tolkien."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Citação",
            titulo = "Luz nas sombras",
            texto = "Das cinzas, um fogo será despertado; uma luz das sombras surgirá. J.R.R. Tolkien."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Citação",
            titulo = "Quando a estrada chama",
            texto = "A estrada continua, seguindo sempre em frente. J.R.R. Tolkien."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Citação",
            titulo = "Pequenas mãos",
            texto = "Até a menor pessoa pode mudar o curso do futuro. J.R.R. Tolkien."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Motivação",
            titulo = "Um pouco mais",
            texto = "Quando parecer difícil continuar, continue só mais um pouco. Às vezes é nesse pouco que a força volta."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Motivação",
            titulo = "Não precisa vencer tudo",
            texto = "Você não precisa vencer a guerra inteira hoje. Só precisa atravessar esta batalha com o coração inteiro."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Motivação",
            titulo = "Firmeza doce",
            texto = "Ser forte também pode ser descansar, respirar e tentar de novo amanhã."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Motivação",
            titulo = "Força suave",
            texto = "A vida não precisa ser perfeita para ser bonita. Às vezes, continuar já é uma forma silenciosa de vencer."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Passagem da Bíblia",
            titulo = "Descanso para a alma",
            texto = "Vinde a mim, todos os que estais cansados e oprimidos, e eu vos aliviarei. Mateus 11:28."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Passagem da Bíblia",
            titulo = "Ele cuida de você",
            texto = "Lançando sobre ele toda a vossa ansiedade, porque ele tem cuidado de vós. 1 Pedro 5:7."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Passagem da Bíblia",
            titulo = "Deus caminha contigo",
            texto = "Não temas, nem te espantes; porque o Senhor teu Deus é contigo, por onde quer que andares. Josué 1:9."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Passagem da Bíblia",
            titulo = "Paz no coração",
            texto = "Deixo-vos a paz, a minha paz vos dou; não vo-la dou como o mundo a dá. Não se turbe o vosso coração. João 14:27."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Passagem da Bíblia",
            titulo = "Perto dos quebrantados",
            texto = "Perto está o Senhor dos que têm o coração quebrantado, e salva os contritos de espírito. Salmo 34:18."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Passagem da Bíblia",
            titulo = "Um dia de cada vez",
            texto = "Não vos inquieteis, pois, pelo dia de amanhã. Basta a cada dia o seu mal. Mateus 6:34."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Passagem da Bíblia",
            titulo = "Forças renovadas",
            texto = "Mas os que esperam no Senhor renovarão as suas forças; subirão com asas como águias. Isaías 40:31."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Passagem da Bíblia",
            titulo = "Nada te separa",
            texto = "Nem a morte, nem a vida, nem o presente, nem o porvir nos poderá separar do amor de Deus. Romanos 8:38-39."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Passagem da Bíblia",
            titulo = "Luz no caminho",
            texto = "Lâmpada para os meus pés é tua palavra, e luz para o meu caminho. Salmo 119:105."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Passagem da Bíblia",
            titulo = "Deus sustenta",
            texto = "Lança o teu cuidado sobre o Senhor, e ele te susterá. Salmo 55:22."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Passagem da Bíblia",
            titulo = "Nada me faltará",
            texto = "O Senhor é o meu pastor, nada me faltará. Deitar-me faz em verdes pastos, guia-me mansamente a águas tranquilas. Salmo 23:1-2."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Passagem da Bíblia",
            titulo = "Pensamentos de paz",
            texto = "Porque eu bem sei os pensamentos que penso de vós, diz o Senhor; pensamentos de paz, e não de mal. Jeremias 29:11."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Passagem da Bíblia",
            titulo = "Amor que permanece",
            texto = "O amor tudo sofre, tudo crê, tudo espera, tudo suporta. 1 Coríntios 13:7."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Passagem da Bíblia",
            titulo = "Refúgio seguro",
            texto = "Deus é o nosso refúgio e fortaleza, socorro bem presente na angústia. Salmo 46:1."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Motivação",
            titulo = "Respira primeiro",
            texto = "Antes de tentar resolver tudo, respira. Nem todo peso precisa ser carregado de uma vez."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Motivação",
            titulo = "Um passo honesto",
            texto = "Um passo pequeno, dado com o coração cansado, ainda é um passo de coragem."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Motivação",
            titulo = "Não precisa vencer tudo",
            texto = "Você não precisa vencer a guerra inteira hoje. Só precisa atravessar esta batalha sem esquecer quem você é."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Motivação",
            titulo = "Força também descansa",
            texto = "Ser forte não é aguentar tudo calada. Às vezes, ser forte é parar, respirar e permitir cuidado."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Motivação",
            titulo = "Você já venceu dias difíceis",
            texto = "Lembra de tudo que você já atravessou. O dia de hoje parece grande, mas você também é."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Motivação",
            titulo = "Não se abandone",
            texto = "Cuide de você com a mesma ternura que você tenta oferecer para todo mundo."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Motivação",
            titulo = "Só o próximo passo",
            texto = "Quando o caminho parecer longo demais, não olha para a montanha inteira. Olha só para o próximo passo."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Motivação",
            titulo = "Você não está sozinha",
            texto = "Mesmo quando sua cabeça disser que você precisa dar conta de tudo, lembra: você não está sozinha."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Motivação",
            titulo = "Gentileza consigo",
            texto = "Hoje, fale com você como falaria com alguém que ama muito. Você também merece esse cuidado."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Motivação",
            titulo = "Dias nublados passam",
            texto = "Nem todo dia bonito começa com sol. Alguns começam nublados e, mesmo assim, terminam em paz."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Motivação",
            titulo = "Você é mais que o cansaço",
            texto = "O cansaço fala alto, mas ele não conta a história inteira. Você é muito mais do que este momento."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Motivação",
            titulo = "Continue com carinho",
            texto = "Continua, mas sem se machucar no caminho. Persistir também pode ser leve."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Motivação",
            titulo = "Firmeza doce",
            texto = "Existe uma força bonita em quem continua sendo doce, mesmo depois de dias difíceis."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Motivação",
            titulo = "A pausa também conta",
            texto = "Pausar não é desistir. Às vezes, a pausa é o jeito que a alma encontra para continuar depois."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Motivação",
            titulo = "Você ainda floresce",
            texto = "Mesmo em dias de inverno por dentro, ainda existe vida se preparando para florescer em você."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Citação",
            titulo = "Novo sonho",
            texto = "Você nunca é velho demais para definir um novo objetivo ou sonhar um novo sonho. C. S. Lewis."
        ),
        Mensagem(
            gaveta = "Leia quando precisar",
            tipo = "Citação",
            titulo = "Coragem calma",
            texto = "A coragem nem sempre ruge. Às vezes, coragem é a voz calma no fim do dia dizendo: amanhã eu tento de novo. Mary Anne Radmacher."
        )
    )

    private val mensagensOQueGosto = listOf(
        Mensagem(
            gaveta = "O que eu gosto em você",
            tipo = "Detalhe que eu amo",
            titulo = "Seu coração",
            texto = "Eu gosto do jeito que você sente as coisas com profundidade. Às vezes isso pesa, mas também é o que torna você tão rara."
        ),
        Mensagem(
            gaveta = "O que eu gosto em você",
            tipo = "Detalhe que eu amo",
            titulo = "Seu cuidado",
            texto = "Eu gosto do jeito que você cuida. Não é só sobre fazer coisas pelos outros. É sobre perceber o que quase ninguém percebe."
        ),
        Mensagem(
            gaveta = "O que eu gosto em você",
            tipo = "Detalhe que eu amo",
            titulo = "Sua força",
            texto = "Eu gosto da sua força, principalmente daquela que aparece nos dias em que você acha que não tem mais nenhuma."
        ),
        Mensagem(
            gaveta = "O que eu gosto em você",
            tipo = "Detalhe que eu amo",
            titulo = "Seu jeito",
            texto = "Eu gosto do seu jeito de transformar momentos simples em lembranças que ficam guardadas dentro da gente."
        ),
        Mensagem(
            gaveta = "O que eu gosto em você",
            tipo = "Detalhe que eu amo",
            titulo = "Sua presença",
            texto = "Eu gosto de como sua presença muda o ambiente. Você chega e parece que alguma parte da vida lembra de respirar."
        ),
        Mensagem(
            gaveta = "O que eu gosto em você",
            tipo = "Detalhe que eu amo",
            titulo = "Seu riso",
            texto = "Eu gosto do seu riso porque ele muda o clima do lugar. É como se a vida abrisse uma janela só para entrar luz."
        ),
        Mensagem(
            gaveta = "O que eu gosto em você",
            tipo = "Detalhe que eu amo",
            titulo = "Sua sensibilidade",
            texto = "Eu gosto da sua sensibilidade. Ela faz você sentir muito, mas também faz você amar de um jeito que pouca gente consegue."
        ),
        Mensagem(
            gaveta = "O que eu gosto em você",
            tipo = "Detalhe que eu amo",
            titulo = "Sua fé",
            texto = "Eu gosto de como sua fé aparece até nos dias difíceis. Às vezes baixinha, às vezes cansada, mas ainda ali, segurando a luz."
        ),
        Mensagem(
            gaveta = "O que eu gosto em você",
            tipo = "Detalhe que eu amo",
            titulo = "Sua maternidade",
            texto = "Eu gosto do seu jeito de ser mãe: intenso, atento, cheio de amor e cuidado nos detalhes que quase ninguém vê."
        ),
        Mensagem(
            gaveta = "O que eu gosto em você",
            tipo = "Detalhe que eu amo",
            titulo = "Seu olhar",
            texto = "Eu gosto do seu olhar. Ele tem uma mistura de força, doçura e mundo inteiro passando por dentro."
        ),
        Mensagem(
            gaveta = "O que eu gosto em você",
            tipo = "Detalhe que eu amo",
            titulo = "Sua coragem",
            texto = "Eu gosto da sua coragem, principalmente porque ela não precisa parecer perfeita. Ela aparece quando você tem medo e continua mesmo assim."
        ),
        Mensagem(
            gaveta = "O que eu gosto em você",
            tipo = "Detalhe que eu amo",
            titulo = "Seu amor",
            texto = "Eu gosto do jeito que você ama. Não é pequeno, não é pela metade, não é distraído. É amor que chega e fica."
        )
    )

    private val mensagensUniverso = listOf(
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "O passado ensina",
            texto = "\"O passado pode doer. Mas você pode fugir dele ou aprender com ele.\" Filme: O Rei Leão."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Eu carrego você",
            texto = "\"Eu não posso carregar isso por você, mas posso carregar você.\" Filme: O Senhor dos Anéis: O Retorno do Rei."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Algo bom",
            texto = "\"Ainda existe algo bom neste mundo, e vale a pena lutar por isso.\" Filme: O Senhor dos Anéis: As Duas Torres."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "A menor pessoa",
            texto = "\"Até a menor pessoa pode mudar o curso do futuro.\" Filme: O Senhor dos Anéis: A Sociedade do Anel."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "A força esteja com você",
            texto = "\"Que a Força esteja com você.\" Filme: Star Wars."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Ao infinito",
            texto = "\"Ao infinito... e além!\" Filme: Toy Story."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Continue nadando",
            texto = "\"Continue a nadar.\" Filme: Procurando Nemo."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Vale derreter",
            texto = "\"Algumas pessoas valem a pena derreter.\" Filme: Frozen."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Hakuna Matata",
            texto = "\"Hakuna Matata. É lindo dizer.\" Filme: O Rei Leão."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "O essencial",
            texto = "\"O essencial é invisível aos olhos.\" Filme: O Pequeno Príncipe."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Sempre",
            texto = "\"Depois de todo esse tempo? Sempre.\" Filme: Harry Potter e as Relíquias da Morte."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Como quiser",
            texto = "\"Como quiser.\" Filme: A Princesa Prometida."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Você me completa",
            texto = "\"Você me completa.\" Filme: Jerry Maguire."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Você me ganhou",
            texto = "\"Você me ganhou no olá.\" Filme: Jerry Maguire."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Só uma garota",
            texto = "\"Sou apenas uma garota, diante de um garoto, pedindo que ele a ame.\" Filme: Um Lugar Chamado Notting Hill."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Aqui está olhando para você",
            texto = "\"Aqui está olhando para você, garota.\" Filme: Casablanca."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Amanhã será outro dia",
            texto = "\"Afinal, amanhã será outro dia.\" Filme: E o Vento Levou."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Não estamos no Kansas",
            texto = "\"Tenho a impressão de que não estamos mais no Kansas.\" Filme: O Mágico de Oz."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Carpe diem",
            texto = "\"Carpe diem. Aproveitem o dia, meninos.\" Filme: Sociedade dos Poetas Mortos."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Grande poder",
            texto = "\"Com grandes poderes vêm grandes responsabilidades.\" Filme: Homem-Aranha."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Quem você seria se fosse...",
            titulo = "Se fosse uma heroína",
            texto = "Você seria aquela heroína que sente tudo profundamente, mas ainda assim escolhe cuidar, amar e continuar."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Quem você seria se fosse...",
            titulo = "Se fosse uma cena",
            texto = "Você seria a cena em que a personagem respira fundo, olha para o céu e decide tentar mais uma vez."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Quem você seria se fosse...",
            titulo = "Se fosse uma trilha sonora",
            texto = "Você seria aquela música que começa suave, mas quando percebemos já virou a alma inteira do filme."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Quem você seria se fosse...",
            titulo = "Estrela-guia",
            texto = "Se você fosse uma constelação, seria aquela que aparece quando a nave quase perde a rota."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Comparação cinematográfica",
            titulo = "Personagem principal",
            texto = "Você tem alma de protagonista: sente medo, cansa, duvida, mas continua caminhando com um coração imenso."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Comparação cinematográfica",
            titulo = "Cena pós-créditos",
            texto = "Você é minha cena pós-créditos favorita: quando parece que acabou, vem você e mostra que ainda tem coisa linda por vir."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Comparação cinematográfica",
            titulo = "A cena que muda tudo",
            texto = "Se nossa vida fosse um filme, você seria aquela cena em que tudo muda de direção e, de repente, o roteiro começa a fazer sentido."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Comparação cinematográfica",
            titulo = "Trilha sonora",
            texto = "Se você fosse uma trilha sonora, seria aquela música que começa baixinho e, sem pedir licença, vira a parte mais bonita do filme."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Comparação cinematográfica",
            titulo = "Plot twist",
            texto = "Você foi o plot twist que eu não sabia que precisava, mas que fez o roteiro inteiro ganhar sentido."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Comparação cinematográfica",
            titulo = "Modo Deadpool",
            texto = "O que um lugar como você faz em uma mulher dessa? Deadpool aprovaria essa pergunta."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Comparação cinematográfica",
            titulo = "Roteiro injusto",
            texto = "Se isso fosse um filme, eu reclamaria do roteiro: ninguém deveria ser tão bonita e ainda ter esse coração."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Comparação cinematográfica",
            titulo = "Multiverso particular",
            texto = "Existem infinitas versões da vida, mas eu tenho quase certeza de que você é minha variante favorita."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Comparação cinematográfica",
            titulo = "Lar",
            texto = "Lar não é só um lugar. Às vezes, lar é uma pessoa. E para mim, muitas vezes, é você."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Meu sonho completo",
            texto = "\"Meu sonho não estaria completo sem você nele.\" Filme: A Princesa e o Sapo."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Minha aventura",
            texto = "\"Você é minha maior aventura.\" Filme: Os Incríveis."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Não tão sozinho",
            texto = "\"As pessoas sempre fazem loucuras quando estão apaixonadas.\" Filme: Hércules."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "O começo da vida inteira",
            texto = "\"Quando você percebe que quer passar o resto da vida com alguém, quer que o resto da vida comece logo.\" Filme: Harry e Sally: Feitos um para o Outro."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Sempre você",
            texto = "\"Você é, e sempre foi, meu sonho.\" Filme: Diário de uma Paixão."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Amor simples",
            texto = "\"Amor significa nunca ter que pedir perdão.\" Filme: Love Story."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Meu olhar favorito",
            texto = "\"Aqui está olhando para você, garota.\" Filme: Casablanca."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "A vida com você",
            texto = "\"A vida é como uma caixa de chocolates. Você nunca sabe o que vai encontrar.\" Filme: Forrest Gump."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Eu escolho você",
            texto = "\"Eu escolho nós.\" Filme: A Escolha."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "O amor fica",
            texto = "\"Nossos amores são como o vento. Não posso vê-los, mas posso senti-los.\" Filme: Um Amor para Recordar."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Envelhecer juntos",
            texto = "\"Eu quero tudo de você, para sempre, você e eu, todos os dias.\" Filme: Diário de uma Paixão."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Dez coisas",
            texto = "\"Eu odeio o jeito como não te odeio. Nem um pouco. Nem mesmo por um segundo.\" Filme: 10 Coisas que Eu Odeio em Você."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Você fica",
            texto = "\"Para mim, você é perfeita.\" Filme: Simplesmente Amor."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Minha melhor parte",
            texto = "\"Eu queria ter feito tudo na Terra com você.\" Filme: O Grande Gatsby."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Em qualquer vida",
            texto = "\"Em outra vida, eu teria gostado de apenas lavar roupas e pagar impostos com você.\" Filme: Tudo em Todo Lugar ao Mesmo Tempo."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "O amor verdadeiro",
            texto = "\"Morte não pode parar o amor verdadeiro. Tudo o que ela pode fazer é adiá-lo por um tempo.\" Filme: A Princesa Prometida."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "A parte boa",
            texto = "\"Eu te amo. Eu sou quem eu sou por sua causa.\" Filme: Diário de uma Paixão."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Mais que palavras",
            texto = "\"Você deveria ser beijada, e muitas vezes, por alguém que sabe como.\" Filme: E o Vento Levou."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Meu impossível",
            texto = "\"Eu vim aqui sem expectativas, apenas para declarar que meu coração é, e sempre será, seu.\" Filme: Razão e Sensibilidade."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Orgulho rendido",
            texto = "\"Você enfeitiçou meu corpo e minha alma.\" Filme: Orgulho e Preconceito."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Minha própria história",
            texto = "\"Todos têm sua própria história.\" Filme: Escritores da Liberdade."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Respeito",
            texto = "\"Para receber respeito, você precisa dar respeito.\" Filme: Escritores da Liberdade."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Eu sou forte",
            texto = "\"Um dia, minha guerra vai acabar. E eu não vou morrer. Eu sou forte.\" Filme: Escritores da Liberdade."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "O certo",
            texto = "\"Eu fiz o que tinha que fazer, porque era a coisa certa a fazer.\" Filme: Escritores da Liberdade."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Não vou deixar você falhar",
            texto = "\"Eu sei contra o que você está lutando. Todos nós estamos lutando contra alguma coisa. Eu não vou deixar você falhar.\" Filme: Escritores da Liberdade."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "O passado ensina",
            texto = "\"O passado pode doer. Mas, do jeito que eu vejo, você pode fugir dele ou aprender com ele.\" Filme: O Rei Leão."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Lembre quem você é",
            texto = "\"Lembre-se de quem você é.\" Filme: O Rei Leão."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Sem preocupações",
            texto = "\"Hakuna Matata. É lindo dizer.\" Filme: O Rei Leão."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Olhe para as estrelas",
            texto = "\"Olhe para as estrelas. Os grandes reis do passado olham por nós lá de cima.\" Filme: O Rei Leão."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "O ciclo da vida",
            texto = "\"Tudo o que você vê existe junto em um delicado equilíbrio.\" Filme: O Rei Leão."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Mais do que parece",
            texto = "\"Há mais em ser rei do que fazer tudo do seu jeito.\" Filme: O Rei Leão."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Você é mais",
            texto = "\"Você é mais do que se tornou.\" Filme: O Rei Leão."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "No coração",
            texto = "\"Ele vive em você.\" Filme: O Rei Leão."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Sem preocupações",
            texto = "\"Hakuna Matata.\" Filme: O Rei Leão."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Reis do passado",
            texto = "Quando eu olhar para as estrelas, vou lembrar que amor também é presença que continua. Referência: O Rei Leão."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Você é mais",
            texto = "Você é muito mais do que os dias difíceis tentam fazer você acreditar. Referência: O Rei Leão."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Mordor particular",
            texto = "Se o caminho parecer Mordor, eu vou com você até o fim da estrada. Referência: O Senhor dos Anéis."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Condado",
            texto = "Você tem cheiro de casa, paz e fim de jornada boa. Referência: O Senhor dos Anéis."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Eu encontrei você",
            texto = "No meio do oceano inteiro, minha parte favorita foi encontrar você. Referência: Procurando Nemo."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Caminho de casa",
            texto = "Quando eu olho para você, alguma parte de mim entende o caminho de volta para casa. Referência: Procurando Nemo."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Amor que aquece",
            texto = "Você é aquele tipo de amor que derrete o gelo sem precisar fazer barulho. Referência: Frozen."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Porta aberta",
            texto = "Com você, até um coração cansado lembra que ainda pode abrir a porta. Referência: Frozen."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Minha dupla",
            texto = "Você é minha parceira de aventura, minha amiga favorita e meu infinito particular. Referência: Toy Story."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Você tem um amigo",
            texto = "Quando o mundo pesar, lembra: você tem um amigo em mim, e um amor também. Referência: Toy Story."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Quase lá",
            texto = "Se a vida disser que ainda falta muito, eu quero continuar quase lá com você. Referência: A Princesa e o Sapo."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Sonho com raiz",
            texto = "Você me lembra que sonho bonito também precisa de coragem, trabalho e amor. Referência: A Princesa e o Sapo."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Meu mundo ideal",
            texto = "Com você, até a janela de um dia comum parece abrir para um mundo ideal. Referência: Aladdin."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Tapete mágico",
            texto = "Se eu tivesse um tapete mágico, ainda escolheria pousar perto de você. Referência: Aladdin."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Tesouro escondido",
            texto = "Você é daquelas descobertas que fazem qualquer caverna de maravilhas perder a graça. Referência: Aladdin."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Coração de fera",
            texto = "Você enxerga beleza onde muita gente só veria confusão. Referência: A Bela e a Fera."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Beleza rara",
            texto = "Sua beleza não mora só no rosto; mora no jeito que você cuida. Referência: A Bela e a Fera."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Biblioteca do coração",
            texto = "Se amor fosse biblioteca, eu passaria a vida relendo você. Referência: A Bela e a Fera."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Coração valente",
            texto = "Você me lembra que coragem é sentir medo e ainda escolher continuar. Referência: Valente."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Destino na mão",
            texto = "Você não espera a vida escrever tudo por você; às vezes pega o arco e muda a história. Referência: Valente."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Fora do mapa",
            texto = "Você é a aventura que eu não planejei, mas que virou meu melhor caminho. Referência: Moana."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "O mar chama",
            texto = "Quando sua alma sonhar longe, eu quero ser porto, não âncora. Referência: Moana."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Quem você é",
            texto = "Mesmo quando você duvida, eu vejo quem você é. Referência: Moana."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Coração selvagem",
            texto = "Você tem um coração que nasceu para sentir o mundo inteiro. Referência: Tarzan."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Duas vidas",
            texto = "Entre dois mundos, eu escolheria aquele em que encontro você. Referência: Tarzan."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Família escolhida",
            texto = "Família também é quem escolhe ficar, cuidar e proteger. Referência: Tarzan."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Na selva da vida",
            texto = "Na selva da vida adulta, você é meu lugar seguro entre os galhos. Referência: Tarzan."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Necessário",
            texto = "Às vezes o necessário é simples: você, paz e um pouco de riso. Referência: Mogli: O Livro da Selva."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "O básico do amor",
            texto = "Você me lembra que o essencial da vida quase sempre cabe em coisas simples. Referência: Mogli: O Livro da Selva."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Caminho da selva",
            texto = "Mesmo quando a vida vira mata fechada, eu atravesso se for com você. Referência: Mogli: O Livro da Selva."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Doidinha boa",
            texto = "Você é doidinha, fora da casinha... e justamente por isso é uma das melhores partes da minha vida. Referência: Alice no País das Maravilhas."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "País das maravilhas",
            texto = "Você transforma minha rotina em um país das maravilhas com boletos e café. Referência: Alice no País das Maravilhas."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Caminho certo",
            texto = "Se eu não souber para onde ir, ainda sei que gosto do caminho que me leva até você. Referência: Alice no País das Maravilhas."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Tempo maluco",
            texto = "Meu relógio emocional vive atrasado, mas sempre chega em você. Referência: Alice no País das Maravilhas."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "O impossível",
            texto = "Você me faz acreditar em umas seis coisas impossíveis antes do café. Referência: Alice no País das Maravilhas."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de série",
            titulo = "Bazinga",
            texto = "\"Bazinga!\" Personagem: Sheldon Cooper. Série: The Big Bang Theory."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de série",
            titulo = "Contrato de amor",
            texto = "Se o Sheldon fizesse um contrato para amar você, eu assinaria sem ler as letras miúdas. Personagem: Sheldon Cooper. Série: The Big Bang Theory."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de série",
            titulo = "Meu ponto fixo",
            texto = "Você é meu lugar no sofá da vida: ninguém ocupa sem meu coração reclamar. Personagem: Sheldon Cooper. Série: The Big Bang Theory."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de série",
            titulo = "Experimento perfeito",
            texto = "Se amar você fosse ciência, eu repetiria o experimento todos os dias. Personagem: Leonard Hofstadter. Série: The Big Bang Theory."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de série",
            titulo = "Penny da minha vida",
            texto = "Você é a pessoa que entra no apartamento e muda a energia da série inteira. Personagem: Penny. Série: The Big Bang Theory."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de série",
            titulo = "Química rara",
            texto = "Nossa química talvez não caiba num quadro branco, mas eu testaria essa teoria para sempre. Personagens: Amy e Sheldon. Série: The Big Bang Theory."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de série",
            titulo = "Nobel do coração",
            texto = "Se existisse Nobel de permanecer, cuidar e amar, eu indicaria você. Personagem: Amy Farrah Fowler. Série: The Big Bang Theory."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de série",
            titulo = "Engenharia emocional",
            texto = "Eu talvez não saiba construir foguetes, mas quero construir uma vida bonita com você. Personagem: Howard Wolowitz. Série: The Big Bang Theory."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de série",
            titulo = "Timidez cósmica",
            texto = "Até o Raj ficaria sem palavras tentando explicar o quanto você é especial. Personagem: Raj Koothrappali. Série: The Big Bang Theory."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Minha força",
            texto = "Você é a força que me puxa para o lado bom até nos dias mais Sith. Referência: Star Wars."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Esperança rebelde",
            texto = "Você tem energia de rebelião bonita: pequena, teimosa e cheia de esperança. Referência: Star Wars."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Baby Groot",
            texto = "Você é minha versão de Groot: poucas palavras bastariam se fossem ditas com amor. Referência: Guardiões da Galáxia."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Hooked on you",
            texto = "Se minha vida tivesse uma mixtape, metade das músicas teria seu nome escondido. Referência: Guardiões da Galáxia."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Família improvável",
            texto = "A gente pode ser uma equipe improvável, mas é justamente isso que torna tudo especial. Referência: Guardiões da Galáxia."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Senhor das estrelas",
            texto = "Eu posso bancar o Star-Lord, mas você é a galáxia que eu quero proteger. Referência: Guardiões da Galáxia."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Eu sou Groot",
            texto = "Se um dia faltarem palavras, entende meu 'eu sou Groot' como 'eu amo você'. Referência: Guardiões da Galáxia."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Capitão Jack",
            texto = "Nem o Jack Sparrow encontraria um tesouro melhor que você. Referência: Piratas do Caribe."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Bússola",
            texto = "Minha bússola pode até não apontar para o norte, mas aponta para você. Referência: Piratas do Caribe."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Pérola Negra",
            texto = "Se a vida for mar bravo, eu topo navegar com você até no casco da coragem. Referência: Piratas do Caribe."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Horizonte",
            texto = "Traga-me aquele horizonte... mas deixa eu levar você comigo. Referência: Piratas do Caribe."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Expecto Patronum",
            texto = "Quando a sombra vier, eu quero ser uma lembrança boa acendendo seu Patrono. Referência: Harry Potter."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Lumos",
            texto = "Você é meu Lumos nos corredores escuros da vida. Referência: Harry Potter."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Casa certa",
            texto = "Se o Chapéu Seletor olhasse seu coração, demoraria: tem coragem, amor, inteligência e lealdade demais. Referência: Harry Potter."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Mapa do Maroto",
            texto = "Se eu tivesse o Mapa do Maroto, procuraria primeiro onde você está. Referência: Harry Potter."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Hércules",
            texto = "Você me lembra que força de verdade não é músculo; é coração escolhendo fazer o bem. Referência: Hércules."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Meu lugar",
            texto = "Eu posso até procurar meu lugar no mundo, mas perto de você eu encontro um pedaço dele. Referência: Hércules."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "De zero a herói",
            texto = "Você transforma meus dias comuns em treinamento de herói. Referência: Hércules."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Meg",
            texto = "Você tem aquele humor de quem já viu muita coisa, mas ainda guarda amor no fundo do peito. Referência: Hércules."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Começar logo",
            texto = "\"Quando você percebe que quer passar o resto da vida com alguém, quer que o resto da vida comece logo.\" Filme: Harry e Sally: Feitos um para o Outro."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Em outra vida",
            texto = "\"Em outra vida, eu teria gostado de apenas lavar roupas e pagar impostos com você.\" Filme: Tudo em Todo Lugar ao Mesmo Tempo."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Amor verdadeiro",
            texto = "\"A morte não pode parar o amor verdadeiro.\" Filme: A Princesa Prometida."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Vento",
            texto = "\"Nosso amor é como o vento: não posso vê-lo, mas posso senti-lo.\" Filme: Um Amor para Recordar."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Todos os dias",
            texto = "\"Eu quero tudo de você, para sempre, você e eu, todos os dias.\" Filme: Diário de uma Paixão."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Meu sonho",
            texto = "\"Você é, e sempre foi, meu sonho.\" Filme: Diário de uma Paixão."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Caderno da vida",
            texto = "Se nossa história virasse diário, eu releria até as páginas amassadas. Referência: Diário de uma Paixão."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Perfeita",
            texto = "\"Para mim, você é perfeita.\" Filme: Simplesmente Amor."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Cartaz na porta",
            texto = "Se eu precisasse dizer sem falar, escreveria em cartazes: você é minha pessoa. Referência: Simplesmente Amor."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Não te odeio",
            texto = "\"Eu odeio o jeito como não te odeio. Nem um pouco.\" Filme: 10 Coisas que Eu Odeio em Você."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Orgulho vencido",
            texto = "Você enfeitiçou meu orgulho, meu juízo e o resto da minha alma. Referência: Orgulho e Preconceito."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Razão e sentimento",
            texto = "Com você, minha razão tenta explicar, mas meu sentimento já decidiu. Referência: Razão e Sensibilidade."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Garota de Casablanca",
            texto = "\"Aqui está olhando para você, garota.\" Filme: Casablanca."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Amanhã",
            texto = "\"Afinal, amanhã será outro dia.\" Filme: E o Vento Levou."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Meu lugar em você",
            texto = "Eu já não estou no Kansas há muito tempo: meu lugar virou você. Referência: O Mágico de Oz."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Frase de filme",
            titulo = "Carpe diem",
            texto = "\"Carpe diem.\" Filme: Sociedade dos Poetas Mortos."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Página viva",
            texto = "Você me lembra que a vida não é só assistir passar; é subir na mesa e escolher enxergar diferente. Referência: Sociedade dos Poetas Mortos."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Teia",
            texto = "Se eu pudesse lançar uma teia no tempo, puxaria todos os caminhos para perto de você. Referência: Homem-Aranha."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Meu escudo",
            texto = "Quando a vida bater forte, eu quero ser escudo, não peso. Referência: Capitão América."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Eu posso fazer isso o dia todo",
            texto = "Amar você, cuidar de você e escolher você? Eu posso fazer isso o dia todo. Referência: Capitão América."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Vingadores",
            texto = "Se a vida convocar os Vingadores, eu vou aparecer com café, abraço e plano B. Referência: Os Vingadores."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Doutor Estranho",
            texto = "Eu vi milhões de futuros possíveis, e nos melhores deles eu volto para você. Referência: Doutor Estranho."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Pantera",
            texto = "Você tem elegância de rainha e força de Wakanda escondida no peito. Referência: Pantera Negra."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Batman",
            texto = "Você é a luz que faria até Gotham parecer menos escura. Referência: Batman."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Superman",
            texto = "Você não precisa voar para ser meu símbolo de esperança. Referência: Superman."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Mulher-Maravilha",
            texto = "Você tem delicadeza no olhar e força de quem atravessaria uma guerra por amor. Referência: Mulher-Maravilha."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "La La Land",
            texto = "Mesmo quando a música muda, tem gente que vira melodia para sempre. Referência: La La Land."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Titanic",
            texto = "Se a vida virar oceano gelado, eu ainda dividiria meu último pedaço de coragem com você. Referência: Titanic."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Antes do amanhecer",
            texto = "Eu passaria uma noite inteira andando e conversando com você como se o mundo pudesse esperar. Referência: Antes do Amanhecer."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Questão de tempo",
            texto = "Se eu pudesse voltar no tempo, escolheria reparar melhor nos pequenos momentos com você. Referência: Questão de Tempo."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Como eu era antes de você",
            texto = "Você chegou e, sem pedir licença, fez muitas partes da vida ganharem cor. Referência: Como Eu Era Antes de Você."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Para todos os garotos",
            texto = "Se eu escrevesse cartas secretas, a maioria teria seu nome no começo. Referência: Para Todos os Garotos que Já Amei."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Cinderela",
            texto = "Mesmo quando a vida parece meia-noite, você me lembra que ainda pode existir encanto no caminho. Referência: Cinderela."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Sapatinho",
            texto = "Se o mundo inteiro procurasse o par perfeito, eu ainda saberia que meu encaixe é você. Referência: Cinderela."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Bela Adormecida",
            texto = "Tem amores que parecem sonho, mas ficam ainda mais bonitos quando a gente acorda e escolhe viver. Referência: A Bela Adormecida."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Once Upon a Dream",
            texto = "Se eu já te encontrei em algum sonho, foi porque meu coração estava ensaiando antes da vida real. Referência: A Bela Adormecida."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Branca de Neve",
            texto = "Você tem essa doçura antiga, dessas que fazem até os dias difíceis baixarem a voz. Referência: Branca de Neve e os Sete Anões."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Espelho",
            texto = "Se o espelho fosse justo, diria que sua beleza começa no coração e só depois chega no rosto. Referência: Branca de Neve."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Ariel",
            texto = "Você tem alma de quem olha para o horizonte e acredita que ainda existe um mundo inteiro para conhecer. Referência: A Pequena Sereia."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Parte do seu mundo",
            texto = "Se existe um mundo onde você está, é desse mundo que eu quero fazer parte. Referência: A Pequena Sereia."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Mulan",
            texto = "Você tem a força de quem floresce até quando ninguém entende a batalha que está enfrentando. Referência: Mulan."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Flor que resiste",
            texto = "A flor que enfrenta o inverno às vezes é a mais rara de todas. Você me lembra isso. Referência: Mulan."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Rapunzel",
            texto = "Você é o tipo de luz que não foi feita para ficar presa em torre nenhuma. Referência: Enrolados."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Luzes flutuantes",
            texto = "Se eu pudesse soltar uma lanterna por cada coisa linda que vejo em você, o céu ficaria pequeno. Referência: Enrolados."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Flynn Rider",
            texto = "Eu posso até fazer pose de malandro, mas perto de você meu coração entrega o roteiro inteiro. Referência: Enrolados."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Moana",
            texto = "Você tem mar no peito: às vezes calmo, às vezes gigante, sempre profundo. Referência: Moana."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "O mar escolheu",
            texto = "Se o mar escolhe quem tem coragem, eu entendo por que ele olharia para você. Referência: Moana."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Encanto",
            texto = "Você não precisa de dom mágico para ser extraordinária. Você já é. Referência: Encanto."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Casita",
            texto = "Se amor construísse paredes, eu queria morar na casa que seu coração faz. Referência: Encanto."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Mirabel",
            texto = "Você me lembra que às vezes quem se sente comum é justamente quem mantém a família inteira de pé. Referência: Encanto."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Divertida Mente",
            texto = "Você é feita de alegria, medo, raiva, tristeza e amor. E eu amo cada parte desse painel de controle. Referência: Divertida Mente."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Tristeza também abraça",
            texto = "Até sua tristeza tem beleza, porque ela mostra o tamanho do seu coração. Referência: Divertida Mente."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Wall-E",
            texto = "Mesmo se o mundo virasse silêncio e poeira, eu ainda procuraria sua mão. Referência: Wall-E."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Eva",
            texto = "Você chegou como uma luz moderna num planeta cansado e fez tudo parecer possível de novo. Referência: Wall-E."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Up",
            texto = "Você é a aventura que eu não preciso viajar longe para viver. Referência: Up: Altas Aventuras."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Livro de aventuras",
            texto = "Se a vida é um livro de aventuras, minhas páginas favoritas têm você nelas. Referência: Up: Altas Aventuras."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Carl e Ellie",
            texto = "Eu quero esse tipo de amor: casa simples, planos rabiscados e uma vida inteira cabendo em memórias. Referência: Up: Altas Aventuras."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Viva",
            texto = "Você é dessas pessoas que ficam na memória como música boa: basta lembrar para o coração cantar. Referência: Viva: A Vida é uma Festa."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Lembre de mim",
            texto = "Se um dia a distância apertar, lembra de mim como alguém que sempre volta para você em amor. Referência: Viva: A Vida é uma Festa."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Ratatouille",
            texto = "Você transforma o comum em coisa especial, igual receita simples que vira memória. Referência: Ratatouille."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Qualquer um pode amar",
            texto = "Se qualquer um pode cozinhar, eu acredito que todo dia simples também pode virar banquete com você. Referência: Ratatouille."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Monstros S.A.",
            texto = "Se eu tivesse que guardar uma energia para mover o mundo, escolheria seu riso. Referência: Monstros S.A."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Boo",
            texto = "Você tem essa presença que desmonta qualquer monstro e transforma medo em cuidado. Referência: Monstros S.A."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Os Incríveis",
            texto = "Você não precisa de uniforme para ser incrível. Basta ser você nos dias em que continua. Referência: Os Incríveis."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Mulher-Elástica",
            texto = "Você se estica por todo mundo, mas eu quero lembrar você de também descansar. Referência: Os Incríveis."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Toy Story",
            texto = "Você é minha parceira de quarto, de vida, de bagunça e de infinito. Referência: Toy Story."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Woody e Buzz",
            texto = "A gente pode até ser diferente, mas no fim forma uma dupla que dá certo. Referência: Toy Story."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Procurando Dory",
            texto = "Quando minha memória emocional falhar, me lembra do essencial: continuar nadando com você. Referência: Procurando Dory."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Luca",
            texto = "Silenzio Bruno: às vezes a gente precisa mandar o medo calar a boca e ir viver. Referência: Luca."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Dois Irmãos",
            texto = "Algumas jornadas não dão tudo que a gente queria, mas entregam exatamente quem precisava estar do lado. Referência: Dois Irmãos: Uma Jornada Fantástica."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Soul",
            texto = "Você me lembra que viver não é só alcançar metas; é reparar no café, no céu, no riso e na mão dada. Referência: Soul."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Red",
            texto = "Você tem fases intensas, fofas e gigantes. E eu amo até o panda vermelho emocional. Referência: Red: Crescer é uma Fera."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Elementos",
            texto = "Você é fogo, água, cuidado e intensidade. Uma mistura impossível que deu certo. Referência: Elementos."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Lilo & Stitch",
            texto = "Ohana quer dizer família. E família quer dizer que eu escolho ficar. Referência: Lilo & Stitch."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Stitch",
            texto = "A gente pode ser meio bagunçado, mas tem uma ternura teimosa que salva tudo. Referência: Lilo & Stitch."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Irmão Urso",
            texto = "Você me lembra que amar também é aprender a enxergar o mundo pelo coração do outro. Referência: Irmão Urso."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Pocahontas",
            texto = "Você tem alma de quem escuta vento, rio, céu e aquilo que muita gente ignora. Referência: Pocahontas."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Cores do vento",
            texto = "Com você, até o vento parece ter cor, conselho e caminho. Referência: Pocahontas."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Corcunda de Notre Dame",
            texto = "Você me lembra que beleza de verdade é o que permanece quando a aparência fica em silêncio. Referência: O Corcunda de Notre Dame."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Esmeralda",
            texto = "Você tem esse coração que se importa com quem muita gente nem vê. Referência: O Corcunda de Notre Dame."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Atlantis",
            texto = "Você é aquele tipo de descoberta rara que muda o sentido da expedição inteira. Referência: Atlantis: O Reino Perdido."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Planeta do Tesouro",
            texto = "Eu posso procurar mapas, estrelas e rotas, mas meu tesouro mais bonito continua sendo você. Referência: Planeta do Tesouro."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Peter Pan",
            texto = "Você me lembra que crescer não precisa matar a parte da gente que ainda acredita. Referência: Peter Pan."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Segunda estrela",
            texto = "Se eu me perder, sigo a segunda estrela à direita e qualquer caminho que leve até você. Referência: Peter Pan."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Robin Hood",
            texto = "Você tem essa coragem bonita de defender quem ama, mesmo quando o mundo cobra caro. Referência: Robin Hood."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Aristogatas",
            texto = "Você tem elegância de gata fina e coração de quem transforma casa em lar. Referência: Aristogatas."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "101 Dálmatas",
            texto = "Com você, até a bagunça vira família, plano e aventura. Referência: 101 Dálmatas."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Dumbo",
            texto = "O que te faz diferente também pode ser exatamente o que te faz voar. Referência: Dumbo."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Bambi",
            texto = "Você tem delicadeza de primavera, dessas que chegam devagar e mudam tudo. Referência: Bambi."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Zootopia",
            texto = "Você me lembra que coração pequeno nenhum entende sonho grande, mas você vai mesmo assim. Referência: Zootopia."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Judy Hopps",
            texto = "Você tem energia de quem escuta 'não dá' e responde vivendo. Referência: Zootopia."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Detona Ralph",
            texto = "Mesmo quando você se sente fora do jogo, para mim você continua sendo a melhor parte da fase. Referência: Detona Ralph."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Vanellope",
            texto = "Seu bug mais bonito é ser única demais para caber no padrão dos outros. Referência: Detona Ralph."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Operação Big Hero",
            texto = "Se dor precisasse de cuidado, eu queria ser seu Baymax com abraço, café e paciência. Referência: Operação Big Hero."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Baymax",
            texto = "Em uma escala de 1 a 10, meu amor por você quebrou o sistema de atendimento. Referência: Operação Big Hero."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Raya",
            texto = "Você me lembra que confiar de novo também é uma coragem imensa. Referência: Raya e o Último Dragão."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Wish",
            texto = "Se desejos virassem estrelas, eu reconheceria o seu brilho no céu inteiro. Referência: Wish."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Uma Linda Mulher",
            texto = "Você não precisa de conto comprado por ninguém: sua presença já muda qualquer cena. Referência: Uma Linda Mulher."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Notting Hill",
            texto = "No fundo eu sou só um homem diante da mulher que ama, tentando não parecer completamente bobo. Referência: Um Lugar Chamado Notting Hill."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "O Diário de Bridget Jones",
            texto = "Eu gosto de você desse jeito: inteira, humana, engraçada, intensa e absolutamente você. Referência: O Diário de Bridget Jones."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Como Perder um Homem",
            texto = "Se isso fosse comédia romântica, eu cairia em todas as suas armadilhas e ainda chamaria de destino. Referência: Como Perder um Homem em 10 Dias."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "De Repente 30",
            texto = "Mesmo se a vida pulasse capítulos, eu ainda ia querer te encontrar na parte adulta da bagunça. Referência: De Repente 30."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Vestida para Casar",
            texto = "Você cuidaria de todo mundo até no próprio filme, mas eu quero ser quem cuida de você também. Referência: Vestida para Casar."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "A Proposta",
            texto = "Você tem esse jeito de transformar contrato, caos e rotina em uma história que termina com sorriso. Referência: A Proposta."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Mensagem para Você",
            texto = "Se amor fosse mensagem perdida na caixa de entrada, eu responderia a sua para sempre. Referência: Mensagem para Você."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Sintonia de Amor",
            texto = "Tem conexões que parecem atravessar distância, sono, rádio e tempo só para acontecer. Referência: Sintonia de Amor."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Um Amor para Recordar",
            texto = "Você é dessas pessoas que fazem o amor parecer oração, cuidado e memória boa. Referência: Um Amor para Recordar."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "A Culpa é das Estrelas",
            texto = "Entre infinitos pequenos, eu escolheria o nosso, porque tem você. Referência: A Culpa é das Estrelas."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "P.S. Eu Te Amo",
            texto = "Se eu deixasse bilhetes pelo mundo, todos seriam jeitos diferentes de dizer que amo você. Referência: P.S. Eu Te Amo."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Casa Comigo?",
            texto = "Se a vida perguntasse de novo, minha resposta ainda seria: sim, com você. Referência: Casa Comigo?"
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Para Sempre",
            texto = "Mesmo quando a memória falha, o amor verdadeiro encontra um jeito de reconhecer casa. Referência: Para Sempre."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Simplesmente Acontece",
            texto = "Às vezes a vida dá voltas enormes só para mostrar que algumas pessoas eram caminho desde o começo. Referência: Simplesmente Acontece."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Amizade Colorida",
            texto = "Eu tentei ser racional, mas meu coração claramente não leu os termos de uso. Referência: Amizade Colorida."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Esposa de Mentirinha",
            texto = "Mesmo nas histórias mais atrapalhadas, você seria a parte verdadeira que faz tudo valer. Referência: Esposa de Mentirinha."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Amor a Toda Prova",
            texto = "Você é esse tipo de amor que bagunça a roupa, o plano e o coração, mas arruma a vida por dentro. Referência: Amor a Toda Prova."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Questão de Tempo",
            texto = "Se eu pudesse reviver um dia, escolheria um simples ao seu lado só para reparar melhor em você. Referência: Questão de Tempo."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Um Dia",
            texto = "Tem pessoas que passam por muitos anos dentro da gente, mesmo quando o calendário finge que não. Referência: Um Dia."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Antes do Amanhecer",
            texto = "Eu toparia atravessar uma cidade inteira só conversando com você como se o mundo tivesse pausado. Referência: Antes do Amanhecer."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "La La Land",
            texto = "Mesmo quando a vida muda a música, algumas pessoas continuam sendo melodia dentro da gente. Referência: La La Land."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Nasce Uma Estrela",
            texto = "Você tem brilho próprio, desses que ninguém precisa acender por você. Referência: Nasce Uma Estrela."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "O Amor Não Tira Férias",
            texto = "Se a vida me mandasse para longe para recomeçar, eu ainda procuraria um caminho de volta para você. Referência: O Amor Não Tira Férias."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Cartas para Julieta",
            texto = "Se existisse uma varanda para todas as cartas de amor, eu deixaria uma com seu nome. Referência: Cartas para Julieta."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Orgulho e Preconceito",
            texto = "Você desorganiza minha razão de um jeito que meu coração chama de destino. Referência: Orgulho e Preconceito."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Razão e Sensibilidade",
            texto = "Entre razão e sentimento, eu escolho o lugar onde você segura minha mão. Referência: Razão e Sensibilidade."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Emma",
            texto = "Talvez o coração demore para perceber o óbvio, mas o meu aprendeu seu nome. Referência: Emma."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Adoráveis Mulheres",
            texto = "Você tem essa beleza de quem sonha alto e ainda guarda carinho para a casa inteira. Referência: Adoráveis Mulheres."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Brooklyn",
            texto = "Lar às vezes não é onde a gente nasceu; é onde o coração aprende a descansar. Referência: Brooklyn."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Comer, Rezar, Amar",
            texto = "Você me lembra que recomeçar também pode ser sagrado, bonito e cheio de fome de vida. Referência: Comer, Rezar, Amar."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Julie & Julia",
            texto = "Com você, até receita, tentativa e cozinha bagunçada parecem capítulo feliz. Referência: Julie & Julia."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Chocolate",
            texto = "Você tem essa doçura que chega sem pedir licença e muda o gosto dos dias. Referência: Chocolate."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Sob o Sol da Toscana",
            texto = "Você é prova de que ruínas também podem virar casa bonita quando recebem amor. Referência: Sob o Sol da Toscana."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Mamma Mia!",
            texto = "Se a vida tocar ABBA no fundo, eu danço errado com você mesmo assim. Referência: Mamma Mia!"
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Dirty Dancing",
            texto = "Ninguém coloca nosso amor no canto da sala. Referência: Dirty Dancing."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Ghost",
            texto = "Tem amores que atravessam silêncio, distância e tempo só para dizer: ainda estou aqui. Referência: Ghost."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Cidade dos Anjos",
            texto = "Se amar você fosse cair do céu para sentir a vida, eu escolheria sentir. Referência: Cidade dos Anjos."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "O Guarda-Costas",
            texto = "Eu não prometo cantar bonito, mas prometo proteger o que existe de bonito em nós. Referência: O Guarda-Costas."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Romeu + Julieta",
            texto = "A gente dispensa tragédia, mas fica com a intensidade poética e o olhar atravessando a sala. Referência: Romeu + Julieta."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Moulin Rouge",
            texto = "A maior coisa que eu poderia aprender é amar e ser amado por você. Referência: Moulin Rouge."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "O Fabuloso Destino de Amélie",
            texto = "Você tem esse encanto de reparar em detalhes pequenos e transformar o mundo em coisa mais humana. Referência: O Fabuloso Destino de Amélie Poulain."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Me Chame Pelo Seu Nome",
            texto = "Algumas histórias ficam como verão na memória: quentes, bonitas e impossíveis de ignorar. Referência: Me Chame Pelo Seu Nome."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "O Lado Bom da Vida",
            texto = "Você é meu lembrete de que até dias quebrados podem encontrar dança, riso e lado bom. Referência: O Lado Bom da Vida."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Ela",
            texto = "Mesmo num mundo cheio de vozes, a sua continua sendo a que meu coração reconhece. Referência: Ela."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Brilho Eterno",
            texto = "Se apagassem minhas memórias, eu suspeito que meu coração ainda tentaria encontrar você. Referência: Brilho Eterno de uma Mente sem Lembranças."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Simplesmente Amor",
            texto = "Se amor está por toda parte, em mim ele costuma apontar para você. Referência: Simplesmente Amor."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Hogwarts",
            texto = "Se Hogwarts fosse real, eu pediria ao Chapéu Seletor para me colocar na casa onde você estivesse. Referência: Harry Potter."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Lumos",
            texto = "Você é meu Lumos quando a vida apaga as luzes do corredor. Referência: Harry Potter."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Patrono",
            texto = "Quando meus dementadores internos aparecem, pensar em você já acende um Patrono. Referência: Harry Potter."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Mapa do Maroto",
            texto = "Se eu tivesse o Mapa do Maroto, meu coração procuraria você antes de qualquer passagem secreta. Referência: Harry Potter."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Felix Felicis",
            texto = "Eu não precisei de Felix Felicis para ter sorte. A vida já me entregou você. Referência: Harry Potter."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Vira-tempo",
            texto = "Se eu tivesse um vira-tempo, voltaria só para reparar melhor nos primeiros momentos com você. Referência: Harry Potter."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Relíquias",
            texto = "Entre capa, pedra e varinha, eu escolheria algo mais raro: uma vida simples com você. Referência: Harry Potter e as Relíquias da Morte."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Sempre",
            texto = "Depois de todo esse tempo, meu coração ainda responderia: sempre. Referência: Harry Potter e as Relíquias da Morte."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Condado",
            texto = "Depois de toda aventura, batalha e cansaço, você é o Condado para onde eu quero voltar. Referência: O Senhor dos Anéis."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Samwise",
            texto = "Eu não prometo carregar todos os anéis da vida, mas prometo não soltar sua mão na subida. Referência: O Senhor dos Anéis."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Frodo",
            texto = "Quando o caminho pesar demais, eu quero ser quem lembra você de que a história ainda não acabou. Referência: O Senhor dos Anéis."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Gandalf",
            texto = "Você me lembra que até nas sombras mais fundas ainda pode existir uma luz esperando a hora certa. Referência: O Senhor dos Anéis."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Aragorn",
            texto = "Você tem essa nobreza quieta de quem talvez duvide de si, mas nasceu para coisas grandes. Referência: O Senhor dos Anéis."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Arwen",
            texto = "Você tem beleza de estrela antiga e coragem de quem escolheria o amor mesmo sabendo que ele muda tudo. Referência: O Senhor dos Anéis."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Legolas",
            texto = "Se a vida trouxer orcs, eu aviso: você mira com o coração, mas acerta onde ninguém espera. Referência: O Senhor dos Anéis."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Gimli",
            texto = "A gente pode discordar feito elfo e anão, mas no fim eu atravessaria a batalha rindo com você. Referência: O Senhor dos Anéis."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Estrela de Eärendil",
            texto = "Você é aquele brilho pequeno que ainda aparece quando tudo parece escuro demais. Referência: O Senhor dos Anéis."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Nárnia",
            texto = "Se um armário levasse para outro mundo, eu abriria todos até encontrar um onde você estivesse. Referência: As Crônicas de Nárnia."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Aslam",
            texto = "Você me lembra que coragem e ternura podem caminhar juntas sem perder a majestade. Referência: As Crônicas de Nárnia."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Lucy",
            texto = "Você tem olhos de quem ainda acredita, mesmo quando os outros já desistiram de ver. Referência: As Crônicas de Nárnia."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Piratas",
            texto = "Se a vida for mar aberto, eu aceito me perder um pouco, desde que seja navegando com você. Referência: Piratas do Caribe."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Jack Sparrow",
            texto = "Minha bússola talvez seja estranha, mas ela sempre aponta para o que meu coração mais quer: você. Referência: Piratas do Caribe."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Pérola Negra",
            texto = "Você é meu tesouro raro, desses que nem capitão bêbado acharia em mapa nenhum. Referência: Piratas do Caribe."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Horizonte",
            texto = "Eu até traria o horizonte, mas primeiro perguntaria se você quer ir junto. Referência: Piratas do Caribe."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Elizabeth Swann",
            texto = "Você tem essa coragem de quem usaria vestido, espada e coração na mesma batalha. Referência: Piratas do Caribe."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Will Turner",
            texto = "Tem promessas que atravessam tempestade, tempo e mar. Eu quero cuidar da nossa. Referência: Piratas do Caribe."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Star-Lord",
            texto = "Eu posso bancar o Senhor das Estrelas, mas perto de você viro só um cara com uma mixtape e saudade. Referência: Guardiões da Galáxia."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Gamora",
            texto = "Você tem beleza de guerreira e coração de quem aprendeu a sobreviver sem perder a capacidade de amar. Referência: Guardiões da Galáxia."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Groot",
            texto = "Se eu dissesse só uma frase para sempre, espero que você entendesse que nela caberia todo meu amor. Referência: Guardiões da Galáxia."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Rocket",
            texto = "A gente pode ser meio caos, meio gambiarra emocional, mas funciona de um jeito estranhamente bonito. Referência: Guardiões da Galáxia."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Mixtape",
            texto = "Se minha vida fosse uma mixtape, você seria a faixa que eu repetiria sem pular. Referência: Guardiões da Galáxia."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Família improvável",
            texto = "Às vezes a melhor família é feita de gente meio quebrada que escolhe ficar. Referência: Guardiões da Galáxia."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Homem de Ferro",
            texto = "Eu posso não ter armadura, mas por você eu inventaria um reator no peito só para aguentar a batalha. Referência: Homem de Ferro."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Tony Stark",
            texto = "Você é a prova de que até um coração cheio de planos precisa de alguém por quem voltar para casa. Referência: Homem de Ferro."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Capitão América",
            texto = "Escolher você? Eu posso fazer isso o dia todo. Referência: Capitão América."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Peggy",
            texto = "Tem danças que a vida adia, mas eu não quero adiar as nossas. Referência: Capitão América."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Thor",
            texto = "Nem todo trovão assusta. Alguns só anunciam que a força voltou. Você é assim. Referência: Thor."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Jane Foster",
            texto = "Você tem inteligência, coragem e uma luz que até deuses respeitariam. Referência: Thor."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Doutor Estranho",
            texto = "Em milhões de possibilidades, meu coração ainda procuraria aquela em que eu encontro você. Referência: Doutor Estranho."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Wanda",
            texto = "Você sente em volume alto, mas isso também mostra o tamanho do amor que existe aí dentro. Referência: WandaVision."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Visão",
            texto = "O amor às vezes é a memória que continua brilhando mesmo quando a cena escurece. Referência: WandaVision."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Pantera Negra",
            texto = "Você tem elegância de rainha e força de quem carrega um reino inteiro no peito. Referência: Pantera Negra."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Shuri",
            texto = "Você tem inteligência afiada, humor no bolso e coração maior que qualquer laboratório. Referência: Pantera Negra."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Homem-Aranha",
            texto = "Se grandes poderes trazem responsabilidades, amar você é minha responsabilidade favorita. Referência: Homem-Aranha."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "MJ",
            texto = "Você tem esse jeito de parecer tranquila enquanto desmonta meu coração com uma frase. Referência: Homem-Aranha."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Batman",
            texto = "Você é aquela luz rara que faria até Gotham lembrar que ainda existe esperança. Referência: Batman."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Mulher-Gato",
            texto = "Você tem mistério, charme e aquele olhar de quem sabe mais do que fala. Referência: Batman."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Lois Lane",
            texto = "Você tem coragem de perguntar, investigar, sentir e ainda permanecer inteira. Referência: Superman."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Mulher-Maravilha",
            texto = "Você tem doçura no olhar e força de quem atravessaria uma guerra por amor. Referência: Mulher-Maravilha."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Diana",
            texto = "Você me lembra que compaixão também pode ser arma de gente forte. Referência: Mulher-Maravilha."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de série",
            titulo = "Sheldon",
            texto = "Se o Sheldon visse nossa história, talvez criasse uma equação só para explicar o absurdo de eu gostar tanto de você. Personagem: Sheldon Cooper. Série: The Big Bang Theory."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de série",
            titulo = "Ponto no sofá",
            texto = "Você é meu lugar preferido no sofá da existência. Personagem: Sheldon Cooper. Série: The Big Bang Theory."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de série",
            titulo = "Amy",
            texto = "Você tem esse poder raro de ser inteligente, intensa e absurdamente carinhosa quando menos esperam. Personagem: Amy Farrah Fowler. Série: The Big Bang Theory."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de série",
            titulo = "Leonard",
            texto = "Eu talvez não seja o mais alto, forte ou perfeito da série, mas sei reconhecer quando encontrei a pessoa que muda tudo. Personagem: Leonard Hofstadter. Série: The Big Bang Theory."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de série",
            titulo = "Penny",
            texto = "Você entra em qualquer cena e muda a energia do episódio inteiro. Personagem: Penny. Série: The Big Bang Theory."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de série",
            titulo = "Howard",
            texto = "Se eu tentasse te conquistar com uma cantada do Howard, você riria. E eu provavelmente tentaria de novo. Personagem: Howard Wolowitz. Série: The Big Bang Theory."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de série",
            titulo = "Raj",
            texto = "Até o Raj ficaria sem palavras tentando explicar o quanto você é especial. Personagem: Raj Koothrappali. Série: The Big Bang Theory."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de série",
            titulo = "Bernadette",
            texto = "Você tem doçura na voz, força no peito e uma capacidade assustadora de colocar ordem no caos. Personagem: Bernadette Rostenkowski. Série: The Big Bang Theory."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de série",
            titulo = "Bazinga",
            texto = "Bazinga é piada. Amar você é ciência comprovada pelo meu coração. Personagem: Sheldon Cooper. Série: The Big Bang Theory."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Tarzan",
            texto = "Você tem coração de selva e alma de quem aprendeu a amar em qualquer mundo. Referência: Tarzan."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Jane",
            texto = "Você tem curiosidade, coragem e um jeito lindo de enxergar beleza onde os outros só veem mata fechada. Referência: Tarzan."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Dois mundos",
            texto = "Entre dois mundos, eu escolheria aquele em que sua mão encontra a minha. Referência: Tarzan."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Kerchak",
            texto = "Mesmo quando o mundo exige dureza, você me lembra que proteger também pode nascer do amor. Referência: Tarzan."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Kala",
            texto = "Você tem esse amor que adota, acolhe e faz casa onde antes havia medo. Referência: Tarzan."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Mogli",
            texto = "Você me lembra que a gente pode pertencer a mais de um mundo e ainda assim ter um coração inteiro. Referência: Mogli: O Livro da Selva."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Balu",
            texto = "Às vezes o necessário é simples: você, um abraço e menos peso no peito. Referência: Mogli: O Livro da Selva."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Bagheera",
            texto = "Eu quero ser aquele cuidado atento que acompanha você pela selva quando o caminho aperta. Referência: Mogli: O Livro da Selva."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Alice",
            texto = "Você é meu País das Maravilhas favorito: meio caos, meio encanto, totalmente inesquecível. Referência: Alice no País das Maravilhas."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Chapeleiro",
            texto = "Se ser normal significasse viver sem você, eu escolheria a loucura elegante do Chapeleiro. Referência: Alice no País das Maravilhas."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Coelho Branco",
            texto = "Posso estar atrasado para muita coisa, mas quero chegar em tempo para amar você direito. Referência: Alice no País das Maravilhas."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Gato Risonho",
            texto = "Você tem esse sorriso que aparece e deixa a cena inteira meio mágica. Referência: Alice no País das Maravilhas."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Hércules",
            texto = "Você me lembra que herói de verdade é quem aprende a amar sem perder a coragem. Referência: Hércules."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Megara",
            texto = "Você tem humor afiado, coração protegido e uma ternura que aparece quando se sente segura. Referência: Hércules."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Phil",
            texto = "Se a vida for treino de herói, eu topo ser o técnico meio doido torcendo por você. Referência: Hércules."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Zero a herói",
            texto = "Você pega dias comuns e transforma em jornada épica sem nem perceber. Referência: Hércules."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Treinamento",
            texto = "Se amar é treinamento de herói, você é minha melhor fase. Referência: Hércules."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Shrek",
            texto = "Você me ensinou que amor de verdade não precisa ser conto perfeito, só precisa ser inteiro. Referência: Shrek."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Fiona",
            texto = "Você é linda em todas as versões, inclusive nas que tenta esconder do mundo. Referência: Shrek."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Burro",
            texto = "Se a vida virar estrada longa, eu prometo conversar, cantar e te irritar com amor até chegar. Referência: Shrek."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Gato de Botas",
            texto = "Se eu fizer olhar de Gato de Botas, é só para você lembrar que eu sou completamente rendido. Referência: Shrek 2."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Kung Fu Panda",
            texto = "Você me lembra que não existe ingrediente secreto: o especial é ser você. Referência: Kung Fu Panda."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Po",
            texto = "Mesmo tropeçando, cansando e improvisando, você ainda pode ser a guerreira dragão da própria história. Referência: Kung Fu Panda."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Como Treinar o Seu Dragão",
            texto = "Você me mostrou que até o medo pode virar parceria quando a gente aprende a cuidar. Referência: Como Treinar o Seu Dragão."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Soluço",
            texto = "Você tem esse jeito de enxergar diferente e mudar uma aldeia inteira por causa disso. Referência: Como Treinar o Seu Dragão."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Banguela",
            texto = "Se o amor fosse dragão, o nosso seria meio desajeitado, intenso e absolutamente leal. Referência: Como Treinar o Seu Dragão."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Avatar",
            texto = "Eu vejo você. Não só o que aparece por fora, mas a imensidão que mora aí dentro. Referência: Avatar."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Pandora",
            texto = "Você tem alma de floresta acesa: cheia de sinais, raízes e luz viva. Referência: Avatar."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Matrix",
            texto = "Se amar você for escolher a pílula que mostra a verdade, eu escolho acordar todos os dias. Referência: Matrix."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Neo",
            texto = "Você me faz acreditar que algumas escolhas mudam o código inteiro da vida. Referência: Matrix."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "De Volta para o Futuro",
            texto = "Se eu tivesse um DeLorean, voltaria só para te encontrar antes e te amar mais tempo. Referência: De Volta para o Futuro."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Marty McFly",
            texto = "Nosso futuro pode ter sustos, mas eu toparia qualquer linha do tempo com você. Referência: De Volta para o Futuro."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Jurassic Park",
            texto = "Você é prova de que o coração também encontra beleza no caos jurássico da vida. Referência: Jurassic Park."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Indiana Jones",
            texto = "Entre templos, mapas e armadilhas, o tesouro que eu procuraria ainda seria você. Referência: Indiana Jones."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "E.T.",
            texto = "Se eu apontasse para casa, meu dedo provavelmente apontaria para você. Referência: E.T. O Extraterrestre."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Jumanji",
            texto = "Com você até fase maluca, tambor estranho e selva no meio da sala viram aventura. Referência: Jumanji."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "A Múmia",
            texto = "Você tem energia de personagem que enfrenta maldição antiga e ainda sai linda na cena seguinte. Referência: A Múmia."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "O Máskara",
            texto = "Você tira de mim um lado bobo que aparece dançando com o coração verde neon. Referência: O Máskara."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Ghostbusters",
            texto = "Se aparecer fantasma do medo, pode chamar: eu venho com mochila, piada e abraço. Referência: Os Caça-Fantasmas."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Men in Black",
            texto = "Eu apagaria algumas vergonhas minhas com o neuralizador, mas jamais as memórias com você. Referência: Homens de Preto."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Missão Impossível",
            texto = "Amar você nos dias fáceis é simples. Nos difíceis, eu aceito a missão também. Referência: Missão Impossível."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Velozes e Furiosos",
            texto = "No fim não é sobre carro, velocidade ou plano perfeito. É sobre família. E você é minha família. Referência: Velozes e Furiosos."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de filme",
            titulo = "Top Gun",
            texto = "Você é meu wingman emocional: quando a vida acelera, eu confio em você no céu comigo. Referência: Top Gun."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Fala de personagem",
            titulo = "Um pouco dos dois",
            texto = "\"O que devemos fazer agora? Algo bom, algo ruim? Um pouco dos dois.\" Personagem: Peter Quill / Star-Lord. Filme: Guardiões da Galáxia."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Fala de personagem",
            titulo = "Eu sou Groot",
            texto = "\"Eu sou Groot.\" Personagem: Groot. Filme: Guardiões da Galáxia."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Tradução do Groot",
            texto = "Quando eu disser pouco, entende como o Groot: tem muito amor escondido na frase. Personagem: Groot. Filme: Guardiões da Galáxia."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Mixtape",
            texto = "Se eu fizer uma mixtape da minha vida, você entra como faixa principal. Personagem: Peter Quill / Star-Lord. Filme: Guardiões da Galáxia."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Dança de distração",
            texto = "Se o plano falhar, eu distraio o vilão dançando e você salva a cena. Personagem: Peter Quill / Star-Lord. Filme: Guardiões da Galáxia."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Gamora",
            texto = "Você tem esse olhar de quem já sobreviveu a muita coisa, mas ainda escolhe sentir. Personagem: Gamora. Filme: Guardiões da Galáxia."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Rocket",
            texto = "A gente pode até parecer uma gambiarra cósmica, mas funciona melhor do que muito plano perfeito. Personagem: Rocket. Filme: Guardiões da Galáxia."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Drax literal",
            texto = "Se eu disser que você é meu universo, não é metáfora passando invisível. É Drax literal mesmo. Personagem: Drax. Filme: Guardiões da Galáxia."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Fala de personagem",
            titulo = "Deadpool sendo Deadpool",
            texto = "\"O que um lugar como você faz em uma garota como essa?\" Personagem: Deadpool. Filme: Deadpool."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Quarta parede",
            texto = "Se eu quebrar a quarta parede, é só para avisar o público que você é minha cena favorita. Personagem: Deadpool. Filme: Deadpool."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Regeneração",
            texto = "Meu senso de humor pode apanhar, mas regenera quando você ri. Personagem: Deadpool. Filme: Deadpool."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Má decisão favorita",
            texto = "Se amar você fosse uma decisão impulsiva de Deadpool, ainda seria a melhor coisa do roteiro. Personagem: Deadpool. Filme: Deadpool."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Fala de personagem",
            titulo = "Bazinga",
            texto = "\"Bazinga!\" Personagem: Sheldon Cooper. Série: The Big Bang Theory."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Meu lugar",
            texto = "Você é meu lugar favorito no sofá da existência. Personagem: Sheldon Cooper. Série: The Big Bang Theory."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Contrato de relacionamento",
            texto = "Se o Sheldon fizesse nosso contrato de relacionamento, a cláusula principal seria: escolher você sempre. Personagem: Sheldon Cooper. Série: The Big Bang Theory."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Teoria comprovada",
            texto = "A hipótese era amor. A evidência é você. Conclusão: caso encerrado. Personagem: Amy Farrah Fowler. Série: The Big Bang Theory."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Leonard apaixonado",
            texto = "Eu posso tropeçar nas palavras, mas reconheço quando uma Penny entra na minha vida e muda tudo. Personagem: Leonard Hofstadter. Série: The Big Bang Theory."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Penny",
            texto = "Você entra na cena e transforma o episódio inteiro. Personagem: Penny. Série: The Big Bang Theory."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Raj sem palavras",
            texto = "Até o Raj ficaria sem fala tentando explicar seu efeito em mim. Personagem: Raj Koothrappali. Série: The Big Bang Theory."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Howard tentando",
            texto = "Se eu soltar uma cantada ruim, considere homenagem ao Howard e um pedido de desculpas antecipado. Personagem: Howard Wolowitz. Série: The Big Bang Theory."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Fala de personagem",
            titulo = "Como quiser",
            texto = "\"Como quiser.\" Personagem: Westley. Filme: A Princesa Prometida."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Tradução do Westley",
            texto = "Quando eu disser 'como quiser', talvez eu esteja dizendo 'eu te amo' do meu jeito. Personagem: Westley. Filme: A Princesa Prometida."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Buttercup",
            texto = "Se a vida fosse conto estranho, pirata e perigo, ainda assim eu atravessaria tudo por você. Personagens: Westley e Buttercup. Filme: A Princesa Prometida."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Fala de personagem",
            titulo = "Inconcebível",
            texto = "\"Inconcebível!\" Personagem: Vizzini. Filme: A Princesa Prometida."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Inigo Montoya",
            texto = "Se alguém mexer com seu sorriso, eu entro em modo Inigo Montoya emocional. Personagem: Inigo Montoya. Filme: A Princesa Prometida."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Fala de personagem",
            titulo = "Eu carrego você",
            texto = "\"Eu não posso carregar isso por você, mas posso carregar você.\" Personagem: Samwise Gamgee. Filme: O Senhor dos Anéis: O Retorno do Rei."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Fala de personagem",
            titulo = "Algo bom",
            texto = "\"Ainda existe algo bom neste mundo, e vale a pena lutar por isso.\" Personagem: Samwise Gamgee. Filme: O Senhor dos Anéis: As Duas Torres."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Sam da vida real",
            texto = "Eu não quero ser herói perfeito. Quero ser seu Sam quando a subida ficar pesada. Personagem: Samwise Gamgee. Filme: O Senhor dos Anéis."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Meu Condado",
            texto = "Depois de cada batalha, você é o Condado para onde meu coração quer voltar. Personagens: Frodo e Sam. Filme: O Senhor dos Anéis."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Fala de personagem",
            titulo = "Você passará",
            texto = "\"Você não passará!\" Personagem: Gandalf. Filme: O Senhor dos Anéis: A Sociedade do Anel."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Gandalf emocional",
            texto = "Quando a tristeza vier atravessar a ponte, eu tento meu melhor Gandalf: daqui ela não passa sozinha. Personagem: Gandalf. Filme: O Senhor dos Anéis."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Aragorn",
            texto = "Você tem essa nobreza de quem duvida do próprio tamanho, mas nasceu para deixar marcas bonitas. Personagem: Aragorn. Filme: O Senhor dos Anéis."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Arwen",
            texto = "Você tem luz de estrela antiga e coragem de quem escolhe amar mesmo quando isso muda tudo. Personagem: Arwen. Filme: O Senhor dos Anéis."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Fala de personagem",
            titulo = "A força",
            texto = "\"Que a Força esteja com você.\" Personagem: Obi-Wan Kenobi. Filme: Star Wars."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Leia",
            texto = "Você tem energia de princesa que lidera rebelião e ainda chama esperança pelo nome. Personagem: Leia Organa. Filme: Star Wars."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Han Solo",
            texto = "Se você disser 'eu te amo', eu tento não responder igual Han Solo. Mas talvez eu pense: eu sei. Personagem: Han Solo. Filme: Star Wars."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Yoda",
            texto = "Muito sentir você me faz. Pouco sentido a frase tem. Mas amor, tem. Personagem: Yoda. Filme: Star Wars."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Mestre Jedi",
            texto = "Se paciência fosse treino Jedi, você seria minha mestra nos dias em que eu ainda sou Padawan. Personagem: Yoda. Filme: Star Wars."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Fala de personagem",
            titulo = "Jack Sparrow",
            texto = "\"Tragam-me aquele horizonte.\" Personagem: Jack Sparrow. Filme: Piratas do Caribe."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Bússola do Jack",
            texto = "Minha bússola pode até não apontar para o norte, mas aponta para você. Personagem: Jack Sparrow. Filme: Piratas do Caribe."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Elizabeth Swann",
            texto = "Você tem coragem de quem entra na cena de vestido, espada e coração sem pedir licença. Personagem: Elizabeth Swann. Filme: Piratas do Caribe."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Will Turner",
            texto = "Se amor fosse promessa atravessando o mar, eu cuidaria da nossa em cada tempestade. Personagem: Will Turner. Filme: Piratas do Caribe."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Fala de personagem",
            titulo = "Sempre",
            texto = "\"Depois de todo esse tempo? Sempre.\" Personagem: Severus Snape. Filme: Harry Potter e as Relíquias da Morte."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Hermione",
            texto = "Você tem inteligência de Hermione, coragem de quem resolve o caos e ainda carrega um coração gigante. Personagem: Hermione Granger. Filme: Harry Potter."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Lumos da Cami",
            texto = "Quando a vida vira corredor escuro de Hogwarts, você acende um Lumos só por existir. Personagem: Hermione Granger. Filme: Harry Potter."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Ron sincero",
            texto = "Se eu fizer cara de Ron sem entender nada, saiba que meu coração entendeu: é você. Personagem: Ron Weasley. Filme: Harry Potter."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Dumbledore",
            texto = "Você me lembra que a luz pode ser encontrada até nos lugares escuros, quando alguém lembra de acendê-la. Personagem: Alvo Dumbledore. Filme: Harry Potter."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Fala de personagem",
            titulo = "Continue nadando",
            texto = "\"Continue a nadar.\" Personagem: Dory. Filme: Procurando Nemo."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Dory",
            texto = "Nos dias em que a cabeça esquecer a esperança, eu viro Dory do seu lado: continua nadando. Personagem: Dory. Filme: Procurando Nemo."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Marlin",
            texto = "Eu posso ser preocupado feito Marlin, mas é porque tem partes do meu mundo que eu quero proteger. Personagem: Marlin. Filme: Procurando Nemo."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Fala de personagem",
            titulo = "Derreter",
            texto = "\"Algumas pessoas valem a pena derreter.\" Personagem: Olaf. Filme: Frozen."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Olaf",
            texto = "Se for por você, eu derreto um pouco, faço piada ruim e ainda chamo isso de amor verdadeiro. Personagem: Olaf. Filme: Frozen."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Elsa",
            texto = "Você tem uma força linda, mesmo quando tenta esconder para não congelar ninguém. Personagem: Elsa. Filme: Frozen."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Anna",
            texto = "Você tem coragem de Anna: ama atravessando frio, medo e porta fechada. Personagem: Anna. Filme: Frozen."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Fala de personagem",
            titulo = "Ao infinito",
            texto = "\"Ao infinito... e além!\" Personagem: Buzz Lightyear. Filme: Toy Story."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Woody",
            texto = "Você tem um amigo em mim, mas também tem um amor que escolhe ficar. Personagem: Woody. Filme: Toy Story."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Buzz",
            texto = "Se for para ir ao infinito, eu só pergunto se você vai junto. Personagem: Buzz Lightyear. Filme: Toy Story."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Jessie",
            texto = "Você tem energia de Jessie: intensa, verdadeira e impossível de ignorar. Personagem: Jessie. Filme: Toy Story."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Tarzan",
            texto = "Você tem coração de quem atravessa dois mundos e ainda escolhe amar com tudo. Personagem: Tarzan. Filme: Tarzan."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Jane",
            texto = "Você tem a curiosidade da Jane e esse jeito bonito de enxergar vida onde os outros só veem selva. Personagem: Jane Porter. Filme: Tarzan."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Kala",
            texto = "Você tem amor de Kala: acolhe, protege e transforma medo em casa. Personagem: Kala. Filme: Tarzan."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Mogli",
            texto = "Você pertence a mais de um mundo e ainda assim consegue ter um coração inteiro. Personagem: Mogli. Filme: Mogli: O Livro da Selva."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Balu",
            texto = "Se o necessário é simples, então é você, paz e um pouco de riso. Personagem: Balu. Filme: Mogli: O Livro da Selva."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Bagheera",
            texto = "Eu quero ser cuidado atento na sua selva: não mando no caminho, mas caminho perto. Personagem: Bagheera. Filme: Mogli: O Livro da Selva."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Alice",
            texto = "Você é meu País das Maravilhas: confusa, linda, intensa e impossível de explicar em linha reta. Personagem: Alice. Filme: Alice no País das Maravilhas."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Chapeleiro",
            texto = "Se amar você for loucura, eu aceito meu chá servido pelo Chapeleiro. Personagem: Chapeleiro Maluco. Filme: Alice no País das Maravilhas."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Gato Risonho",
            texto = "Seu sorriso tem efeito de Gato Risonho: aparece e deixa tudo meio mágico. Personagem: Gato Risonho. Filme: Alice no País das Maravilhas."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Coelho Branco",
            texto = "Eu posso estar atrasado para muita coisa, mas não quero me atrasar para amar você melhor. Personagem: Coelho Branco. Filme: Alice no País das Maravilhas."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Hércules",
            texto = "Você me lembra que herói de verdade não é quem não cai, é quem levanta por amor. Personagem: Hércules. Filme: Hércules."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Megara",
            texto = "Você tem humor de Meg, coração blindado e uma ternura que aparece quando confia. Personagem: Megara. Filme: Hércules."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Phil",
            texto = "Se a vida for treino de herói, eu viro Phil e grito do lado: você consegue. Personagem: Phil. Filme: Hércules."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Simba",
            texto = "Quando você esquecer quem é, eu tento ser aquela voz lembrando a grandeza que mora aí. Personagem: Simba. Filme: O Rei Leão."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Rafiki",
            texto = "Se o passado doer, eu fico do seu lado enquanto você aprende com ele. Personagem: Rafiki. Filme: O Rei Leão."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Mufasa",
            texto = "Quando olhar para as estrelas, lembra que amor de verdade continua guiando mesmo em silêncio. Personagem: Mufasa. Filme: O Rei Leão."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Timon e Pumba",
            texto = "Se o dia pesar, eu aceito modo Timon e Pumba: menos preocupação, mais abraço e alguma piada ruim. Personagens: Timon e Pumba. Filme: O Rei Leão."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Fala de personagem",
            titulo = "Você me completa",
            texto = "\"Você me completa.\" Personagem: Jerry Maguire. Filme: Jerry Maguire."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Fala de personagem",
            titulo = "Você me ganhou",
            texto = "\"Você me ganhou no olá.\" Personagem: Dorothy Boyd. Filme: Jerry Maguire."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Fala de personagem",
            titulo = "Só uma garota",
            texto = "\"Sou apenas uma garota, diante de um garoto, pedindo que ele a ame.\" Personagem: Anna Scott. Filme: Um Lugar Chamado Notting Hill."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Fala de personagem",
            titulo = "Todo dia",
            texto = "\"Eu quero tudo de você, para sempre, você e eu, todos os dias.\" Personagem: Noah. Filme: Diário de uma Paixão."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Fala de personagem",
            titulo = "Meu sonho",
            texto = "\"Você é, e sempre foi, meu sonho.\" Personagem: Noah. Filme: Diário de uma Paixão."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Fala de personagem",
            titulo = "Para mim",
            texto = "\"Para mim, você é perfeita.\" Personagem: Mark. Filme: Simplesmente Amor."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Fala de personagem",
            titulo = "Não te odeio",
            texto = "\"Eu odeio o jeito como não te odeio. Nem um pouco.\" Personagem: Kat Stratford. Filme: 10 Coisas que Eu Odeio em Você."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Bridget Jones",
            texto = "Eu gosto de você exatamente assim: humana, intensa, engraçada e absolutamente você. Personagem: Mark Darcy. Filme: O Diário de Bridget Jones."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Jenna",
            texto = "Mesmo se a vida pulasse capítulos, eu ainda ia querer encontrar você na versão adulta da bagunça. Personagem: Jenna Rink. Filme: De Repente 30."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Patrick Verona",
            texto = "Eu cantaria no estádio se fosse preciso, mas talvez desafine menos por mensagem. Personagem: Patrick Verona. Filme: 10 Coisas que Eu Odeio em Você."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Referência de personagem",
            titulo = "Jack e Rose",
            texto = "Se a vida virar oceano, eu prometo procurar uma porta maior para nós dois. Personagens: Jack e Rose. Filme: Titanic."
        ),
        Mensagem(
            gaveta = "Seu lugar no meu universo",
            tipo = "Fala de personagem",
            titulo = "Em outra vida",
            texto = "\"Em outra vida, eu teria gostado de apenas lavar roupas e pagar impostos com você.\" Personagem: Waymond Wang. Filme: Tudo em Todo Lugar ao Mesmo Tempo."
        )
    )

    private val mensagensMusicas = listOf(
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "You'll Never Walk Alone",
            texto = "🎵 Música: You'll Never Walk Alone\n🎤 Artista/Banda: Gerry & The Pacemakers\n💌 Motivo: Porque quando o caminho apertar, eu quero que você lembre que nunca caminha sozinha. Mesmo nos dias difíceis, eu quero ser presença, mão dada e arquibancada cantando por você."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "Pra Você Guardei o Amor",
            texto = "🎵 Música: Pra Você Guardei o Amor\n🎤 Artista/Banda: Nando Reis e Ana Cañas\n💌 Motivo: Porque tem amores que parecem guardados com cuidado até a hora certa. Essa música tem cara de bilhete escondido, amor maduro e encontro que não precisa gritar para ser imenso."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "Velha Infância",
            texto = "🎵 Música: Velha Infância\n🎤 Artista/Banda: Tribalistas\n💌 Motivo: Porque amar você também tem gosto de parceria simples: rir junto, viver junto, dividir rotina e sentir que a vida fica mais leve quando você está por perto."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "All of Me",
            texto = "🎵 Música: All of Me\n🎤 Artista/Banda: John Legend\n💌 Motivo: Porque amar você é amar tudo: sua força, sua sensibilidade, suas fases intensas, seu cansaço, seu riso, sua beleza e esse coração enorme que às vezes nem você percebe."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "A Thousand Years",
            texto = "🎵 Música: A Thousand Years\n🎤 Artista/Banda: Christina Perri\n💌 Motivo: Porque algumas escolhas parecem atravessar o tempo antes mesmo da gente entender. Tem amores que chegam com cara de promessa antiga."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "Como é Grande o Meu Amor por Você",
            texto = "🎵 Música: Como é Grande o Meu Amor por Você\n🎤 Artista/Banda: Roberto Carlos\n💌 Motivo: Porque às vezes a frase mais simples é a única que dá conta do tamanho do sentimento. Sem enfeite demais: é grande. Muito grande."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "Trem-Bala",
            texto = "🎵 Música: Trem-Bala\n🎤 Artista/Banda: Ana Vilela\n💌 Motivo: Porque a vida passa rápido, e eu quero viver os detalhes com você: o café, o mercado, as crianças, o sofá, os planos, os sustos e as pequenas pazes no meio do caminho."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "Ainda Bem",
            texto = "🎵 Música: Ainda Bem\n🎤 Artista/Banda: Marisa Monte\n💌 Motivo: Porque ainda bem que, no meio de tanta gente e tanta possibilidade, a vida trouxe você para perto de mim. Ainda bem mesmo."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "Fix You",
            texto = "🎵 Música: Fix You\n🎤 Artista/Banda: Coldplay\n💌 Motivo: Porque eu não prometo consertar tudo. Mas prometo ficar perto enquanto a luz volta, enquanto o peito acalma e enquanto você lembra da força que tem."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "Yellow",
            texto = "🎵 Música: Yellow\n🎤 Artista/Banda: Coldplay\n💌 Motivo: Porque tem gente que faz o mundo parecer mais bonito sem precisar fazer esforço. Você tem esse tipo de luz: discreta, quente e impossível de ignorar."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "Iris",
            texto = "🎵 Música: Iris\n🎤 Artista/Banda: Goo Goo Dolls\n💌 Motivo: Porque às vezes a gente só quer ser visto de verdade. E eu vejo você: não só a parte forte, mas também a parte cansada, sensível e humana que merece colo."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "Perfect",
            texto = "🎵 Música: Perfect\n🎤 Artista/Banda: Ed Sheeran\n💌 Motivo: Porque tem cenas simples que parecem filme: uma música, um olhar, um abraço e a sensação de que a vida acertou em cheio por alguns minutos."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "Thinking Out Loud",
            texto = "🎵 Música: Thinking Out Loud\n🎤 Artista/Banda: Ed Sheeran\n💌 Motivo: Porque eu quero esse amor que atravessa os anos, muda de fase, ganha marcas, mas continua escolhendo dançar junto."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "Photograph",
            texto = "🎵 Música: Photograph\n🎤 Artista/Banda: Ed Sheeran\n💌 Motivo: Porque algumas memórias viram fotografia dentro da gente. E eu quero guardar as nossas com carinho, até as mais simples."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "Better Together",
            texto = "🎵 Música: Better Together\n🎤 Artista/Banda: Jack Johnson\n💌 Motivo: Porque algumas coisas simplesmente ficam melhores juntas. Eu e você temos essa cara de parceria que deixa a vida menos dura."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "Lucky",
            texto = "🎵 Música: Lucky\n🎤 Artista/Banda: Jason Mraz e Colbie Caillat\n💌 Motivo: Porque amar alguém que também é companhia é uma sorte rara. É romance, mas também amizade, risada e casa."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "I'm Yours",
            texto = "🎵 Música: I'm Yours\n🎤 Artista/Banda: Jason Mraz\n💌 Motivo: Porque essa tem energia de coração aberto, leveza e escolha. Daquelas que parecem dizer: pronto, cheguei, sou seu."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "You Are the Reason",
            texto = "🎵 Música: You Are the Reason\n🎤 Artista/Banda: Calum Scott\n💌 Motivo: Porque você é uma das razões pelas quais eu tento ser melhor, continuar, cuidar e construir alguma coisa bonita."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "Stand By Me",
            texto = "🎵 Música: Stand By Me\n🎤 Artista/Banda: Ben E. King\n💌 Motivo: Porque no fundo é isso: fica comigo. Nos dias bons, nos dias estranhos, nas fases difíceis e nos recomeços."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "Can't Help Falling in Love",
            texto = "🎵 Música: Can't Help Falling in Love\n🎤 Artista/Banda: Elvis Presley\n💌 Motivo: Porque alguns amores parecem acontecer antes da gente conseguir explicar. Quando vê, o coração já foi."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "Something",
            texto = "🎵 Música: Something\n🎤 Artista/Banda: The Beatles\n💌 Motivo: Porque tem algo em você que não cabe em explicação rápida. É jeito, presença, olhar, cuidado e esse mistério bonito de ser você."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "Here Comes the Sun",
            texto = "🎵 Música: Here Comes the Sun\n🎤 Artista/Banda: The Beatles\n💌 Motivo: Porque depois de dias pesados, você me lembra que o sol ainda volta. Às vezes devagar, às vezes pequeno, mas volta."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "God Only Knows",
            texto = "🎵 Música: God Only Knows\n🎤 Artista/Banda: The Beach Boys\n💌 Motivo: Porque tem amores que a gente tenta medir e não consegue. Só Deus sabe o tamanho exato do que você significa para mim."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "Just the Way You Are",
            texto = "🎵 Música: Just the Way You Are\n🎤 Artista/Banda: Bruno Mars\n💌 Motivo: Porque você não precisa virar outra pessoa para ser amada. Eu amo seu jeito, suas camadas e sua verdade."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "Count on Me",
            texto = "🎵 Música: Count on Me\n🎤 Artista/Banda: Bruno Mars\n💌 Motivo: Porque eu quero ser alguém com quem você possa contar. Não só nas grandes cenas, mas nas pequenas também."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "Marry You",
            texto = "🎵 Música: Marry You\n🎤 Artista/Banda: Bruno Mars\n💌 Motivo: Porque tem uma alegria meio boba e bonita em pensar: sim, eu escolheria você de novo, com música alta e sorriso no rosto."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "Amei Te Ver",
            texto = "🎵 Música: Amei Te Ver\n🎤 Artista/Banda: Tiago Iorc\n💌 Motivo: Porque tem encontros que parecem simples por fora, mas por dentro mudam o clima inteiro do coração."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "Coisa Linda",
            texto = "🎵 Música: Coisa Linda\n🎤 Artista/Banda: Tiago Iorc\n💌 Motivo: Porque você é bonita de um jeito que não é só aparência. É presença, detalhe, gesto e alma."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "Eu Sei Que Vou Te Amar",
            texto = "🎵 Música: Eu Sei Que Vou Te Amar\n🎤 Artista/Banda: Tom Jobim e Vinicius de Moraes\n💌 Motivo: Porque tem declaração que parece atravessar o tempo. Clássica, intensa e direta como promessa."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "Pela Luz dos Olhos Teus",
            texto = "🎵 Música: Pela Luz dos Olhos Teus\n🎤 Artista/Banda: Tom Jobim e Miúcha\n💌 Motivo: Porque tem olhares que conversam antes da boca. E o seu olhar sempre teve um mundo dentro."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "É Você",
            texto = "🎵 Música: É Você\n🎤 Artista/Banda: Tribalistas\n💌 Motivo: Porque às vezes o coração não faz discurso: ele aponta e diz simples assim. É você."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "De Janeiro a Janeiro",
            texto = "🎵 Música: De Janeiro a Janeiro\n🎤 Artista/Banda: Roberta Campos e Nando Reis\n💌 Motivo: Porque eu gosto da ideia de amor atravessando calendário inteiro: janeiro, junho, dias comuns, datas importantes e tudo que vier."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "Ainda Gosto Dela",
            texto = "🎵 Música: Ainda Gosto Dela\n🎤 Artista/Banda: Skank e Negra Li\n💌 Motivo: Porque tem sentimento que continua ali, mesmo quando a vida cansa, corre, muda e bagunça tudo. Ainda gosto. Muito."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "Dois Rios",
            texto = "🎵 Música: Dois Rios\n🎤 Artista/Banda: Skank\n💌 Motivo: Porque nós dois somos rios diferentes tentando encontrar o mesmo mar: família, amor, casa e futuro."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "Por Onde Andei",
            texto = "🎵 Música: Por Onde Andei\n🎤 Artista/Banda: Nando Reis\n💌 Motivo: Porque tem saudade que mostra o tamanho do amor. E quando penso em caminho, volta e casa, acabo pensando em você."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "Resposta",
            texto = "🎵 Música: Resposta\n🎤 Artista/Banda: Skank\n💌 Motivo: Porque algumas respostas da vida não vêm em frase pronta. Às vezes vêm em forma de pessoa. No meu caso, muita coisa veio em forma de você."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "Só Hoje",
            texto = "🎵 Música: Só Hoje\n🎤 Artista/Banda: Jota Quest\n💌 Motivo: Porque tem dias em que tudo que a gente precisa é de presença, calma e alguém dizendo: hoje eu fico aqui com você."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "O Sol",
            texto = "🎵 Música: O Sol\n🎤 Artista/Banda: Jota Quest\n💌 Motivo: Porque você tem esse jeito de lembrar que a luz volta. Mesmo quando parece escondida, ela volta."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "Dias Melhores",
            texto = "🎵 Música: Dias Melhores\n🎤 Artista/Banda: Jota Quest\n💌 Motivo: Porque eu acredito em dias melhores para nós. Não perfeitos, mas mais leves, mais nossos e mais cheios de paz."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "Pais e Filhos",
            texto = "🎵 Música: Pais e Filhos\n🎤 Artista/Banda: Legião Urbana\n💌 Motivo: Porque nossa história também tem família, filhos, cuidado, medo, tentativa e amor aprendendo a amadurecer no meio da vida real."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "Tempo Perdido",
            texto = "🎵 Música: Tempo Perdido\n🎤 Artista/Banda: Legião Urbana\n💌 Motivo: Porque temos nosso próprio tempo. E eu quero gastar o meu construindo algo bonito com você."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "Monte Castelo",
            texto = "🎵 Música: Monte Castelo\n🎤 Artista/Banda: Legião Urbana\n💌 Motivo: Porque fala de amor com um peso quase sagrado. Amor que não é só sentimento bonito, mas escolha, paciência e entrega."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "Oração",
            texto = "🎵 Música: Oração\n🎤 Artista/Banda: A Banda Mais Bonita da Cidade\n💌 Motivo: Porque tem amor que parece casa cheia, janela aberta, gente cantando junto e coração encontrando descanso."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "Anunciação",
            texto = "🎵 Música: Anunciação\n🎤 Artista/Banda: Alceu Valença\n💌 Motivo: Porque tem chegadas que a gente sente antes de ver. Você tem essa energia de chegada bonita, de notícia boa entrando pela porta."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "Girassol",
            texto = "🎵 Música: Girassol\n🎤 Artista/Banda: Cidade Negra\n💌 Motivo: Porque eu quero que a vida te trate com mais sol, mais leveza e mais motivos para florescer."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "Onde Você Mora?",
            texto = "🎵 Música: Onde Você Mora?\n🎤 Artista/Banda: Cidade Negra\n💌 Motivo: Porque lar não é só endereço. Às vezes é onde a pessoa amada existe e faz o mundo parecer menos frio."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "Meu Abrigo",
            texto = "🎵 Música: Meu Abrigo\n🎤 Artista/Banda: Melim\n💌 Motivo: Porque você é abrigo de muitos, mas eu também quero ser abrigo para você quando seu coração cansar."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "Ouvi Dizer",
            texto = "🎵 Música: Ouvi Dizer\n🎤 Artista/Banda: Melim\n💌 Motivo: Porque tem amor que dá vontade de espalhar por aí, mas no fundo eu só queria que você soubesse bem de perto."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "Trevo",
            texto = "🎵 Música: Trevo\n🎤 Artista/Banda: Anavitória e Tiago Iorc\n💌 Motivo: Porque você é sorte, mas não só sorte. É encontro, escolha, cuidado e aquele detalhe bom que muda o dia."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "Porque Eu Te Amo",
            texto = "🎵 Música: Porque Eu Te Amo\n🎤 Artista/Banda: Anavitória\n💌 Motivo: Porque algumas explicações começam e terminam aí: porque eu te amo. Simples, direto e gigante."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "Fica",
            texto = "🎵 Música: Fica\n🎤 Artista/Banda: Anavitória e Matheus & Kauan\n💌 Motivo: Porque no meio de qualquer caos, tem uma palavra que eu sempre gostaria de dizer para você com carinho: fica."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "Partilhar",
            texto = "🎵 Música: Partilhar\n🎤 Artista/Banda: Rubel e Anavitória\n💌 Motivo: Porque eu quero partilhar mais do que momentos bonitos. Quero dividir rotina, planos, medo, fé, boletos, riso e futuro."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "Quando Bate Aquela Saudade",
            texto = "🎵 Música: Quando Bate Aquela Saudade\n🎤 Artista/Banda: Rubel\n💌 Motivo: Porque saudade também é um jeito do coração apontar para onde ele quer voltar."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "Exagerado",
            texto = "🎵 Música: Exagerado\n🎤 Artista/Banda: Cazuza\n💌 Motivo: Porque eu posso até tentar parecer equilibrado, mas às vezes amar você me deixa ridiculamente exagerado por dentro."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "Codinome Beija-Flor",
            texto = "🎵 Música: Codinome Beija-Flor\n🎤 Artista/Banda: Cazuza\n💌 Motivo: Porque tem amores que viram código secreto, apelido interno e lugar escondido dentro da memória."
        ),
        Mensagem(
            gaveta = "Trilha sonora de nós",
            tipo = "Música",
            titulo = "Amor I Love You",
            texto = "🎵 Música: Amor I Love You\n🎤 Artista/Banda: Marisa Monte\n💌 Motivo: Porque tem declaração que mistura idioma, bobeira e intensidade, igual coração tentando falar bonito e se embolando todo."
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtGaveta = findViewById(R.id.txtGaveta)
        txtTipo = findViewById(R.id.txtTipo)
        txtTituloMensagem = findViewById(R.id.txtTituloMensagem)
        txtMensagem = findViewById(R.id.txtMensagem)
        cardMensagem = findViewById(R.id.cardMensagem)
        btnMusicas = findViewById(R.id.btnMusicas)

        btnLeiaQuandoPrecisar = findViewById(R.id.btnLeiaQuandoPrecisar)
        btnOQueGosto = findViewById(R.id.btnOQueGosto)
        btnUniverso = findViewById(R.id.btnUniverso)

        btnLeiaQuandoPrecisar.setOnClickListener {
            sortearMensagem(mensagensLeiaQuandoPrecisar)
        }

        btnOQueGosto.setOnClickListener {
            sortearMensagem(mensagensOQueGosto)
        }

        btnUniverso.setOnClickListener {
            sortearMensagem(mensagensUniverso)
        }

        btnMusicas.setOnClickListener {
            sortearMensagem(mensagensMusicas)
        }
    }

    private fun sortearMensagem(lista: List<Mensagem>) {
        val mensagem = lista[Random.nextInt(lista.size)]

        txtGaveta.text = mensagem.gaveta
        txtTipo.text = mensagem.tipo
        txtTituloMensagem.text = mensagem.titulo
        txtMensagem.text = mensagem.texto

        animarCard()
    }

    private fun animarCard() {
        cardMensagem.alpha = 0f
        cardMensagem.translationY = 24f

        cardMensagem.animate()
            .alpha(1f)
            .translationY(0f)
            .setDuration(350)
            .start()
    }
}
