# BichinhoVirtual

🐾 Simulador de Animal de Estimação Virtual

Projeto em **Kotlin** para praticar Programação Orientada a Objetos (POO). Você cuida de um bichinho virtual e precisa fazê-lo chegar à **idade 50** sem que ele perca.

## 🎮 Como jogar

Ao iniciar, digite o nome do seu pet e escolha uma ação no menu:

| Opção | Ação | Efeito |
|-------|------|--------|
| 1 | Alimentar | Diminui a fome e aumenta a vontade de ir ao banheiro |
| 2 | Brincar | Aumenta a felicidade, o cansaço e a sujeira |
| 3 | Descansar | Diminui o cansaço (8 horas = totalmente descansado) |
| 4 | Verificar status | Mostra os valores atuais (não gasta tempo) |
| 5 | Sair | Encerra o jogo |

A cada ação, um ciclo de tempo passa:

- Fome: +3
- Felicidade: -3
- Cansaço: +10
- Idade: +1

## 🏆 Regras

**Vitória:** o pet chega à idade 50.

**Derrota:**
- Fome chega a 100
- Cansaço chega a 100
- Felicidade chega a 0
- Banheiro chega a 100 (desafio extra)
- Sujeira chega a 100 (desafio extra)

## ▶️ Como executar

**Pelo IntelliJ IDEA:**
1. Abra o projeto.
2. Abra o arquivo `Main.kt`.
3. Clique no botão ▶️ ao lado da função `main`.

**Pelo terminal (com Kotlin instalado):**
```bash
kotlinc Main.kt -include-runtime -d pet.jar
java -jar pet.jar
```

## 🚀 Como subir o projeto no GitHub

1. Crie uma conta em [github.com](https://github.com), se ainda não tiver.
2. Clique em **New repository**, dê um nome (ex.: `bichinho-virtual`) e clique em **Create repository**.
3. No terminal, dentro da pasta do projeto, rode:

```bash
git init
git add .
git commit -m "Primeira versão do bichinho virtual"
git branch -M main
git remote add origin https://github.com/SEU-USUARIO/bichinho-virtual.git
git push -u origin main
```

> Troque `SEU-USUARIO` pelo seu nome de usuário do GitHub.

Para enviar mudanças depois:

```bash
git add .
git commit -m "Descreva o que mudou"
git push
```

## 🛠️ Tecnologias

- Kotlin
- Programação Orientada a Objetos

## 📚 Projeto do curso

Feito como parte do desafio **Hora de Codar: Uma Nova Geração**.
