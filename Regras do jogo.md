# ✊✋✌️ Jokenpô

Um projeto simples que implementa o clássico jogo **Jokenpô (Pedra, Papel e Tesoura)**.

## 📖 Sobre o jogo

Jokenpô é um jogo de escolhas simultâneas entre dois jogadores. Cada participante deve escolher uma das três opções:

- ✊ Pedra
- ✋ Papel
- ✌️ Tesoura

Após as escolhas, as jogadas são comparadas para determinar o vencedor.

## 📋 Regras

As regras são simples:

| Jogada | Vence de | Perde para |
|--------|----------|------------|
| ✊ Pedra | ✌️ Tesoura | ✋ Papel |
| ✋ Papel | ✊ Pedra | ✌️ Tesoura |
| ✌️ Tesoura | ✋ Papel | ✊ Pedra |

### Resumo das regras

- ✊ Pedra quebra a ✌️ Tesoura.
- ✋ Papel embrulha a ✊ Pedra.
- ✌️ Tesoura corta o ✋ Papel.
- Se ambos escolherem a mesma opção, o resultado é **empate**.

## 🎮 Como funciona

1. O jogador escolhe uma opção:
   - Pedra
   - Papel
   - Tesoura
2. O computador (ou o segundo jogador) realiza sua escolha.
3. As jogadas são comparadas.
4. O resultado é exibido:
   - Vitória
   - Derrota
   - Empate

## 🧠 Lógica do jogo

```
Se jogador == computador:
    Empate

Senão se:
    Pedra vence Tesoura
    Papel vence Pedra
    Tesoura vence Papel
Então:
    Jogador vence

Caso contrário:
    Computador vence
```

## 📊 Tabela de resultados

| Jogador | Computador | Resultado |
|----------|------------|-----------|
| Pedra | Pedra | Empate |
| Pedra | Papel | Computador vence |
| Pedra | Tesoura | Jogador vence |
| Papel | Pedra | Jogador vence |
| Papel | Papel | Empate |
| Papel | Tesoura | Computador vence |
| Tesoura | Pedra | Computador vence |
| Tesoura | Papel | Jogador vence |
| Tesoura | Tesoura | Empate |

## 🚀 Objetivo

Este projeto tem como objetivo praticar conceitos básicos de programação, como:

- Estruturas condicionais
- Entrada e saída de dados
- Geração de números aleatórios
- Comparação de valores
- Lógica de programação
