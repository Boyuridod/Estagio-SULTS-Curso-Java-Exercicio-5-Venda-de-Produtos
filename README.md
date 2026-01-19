# 🛒 Estagio-1-Curso-Java-Exercicio-5-Venda-de-Produtos

Este projeto foi desenvolvido como parte do meu **treinamento em Programação Orientada a Objetos (POO)**, utilizando o curso
[**Java COMPLETO – Programação Orientada a Objetos + Projetos**](https://www.udemy.com/course/java-curso-completo/).

---

## 🎯 Objetivo do Projeto

O objetivo deste aplicativo é **simular um sistema de cadastro e exibição de produtos**, aplicando conceitos importantes de **Herança e Polimorfismo em Java**.

O programa permite:

* Cadastrar produtos do tipo:

  * **Comum**
  * **Usado**
  * **Importado**
* Armazenar os produtos em uma lista
* Exibir a **etiqueta de preço (price tag)** de cada produto
* Tratar diferentes comportamentos de cálculo e exibição conforme o tipo do produto

Toda a interação ocorre via **console**, com entrada de dados feita pelo usuário.

---

## 🧠 Conceitos de POO Aplicados

✔️ Classes e Objetos

✔️ **Herança** (`Product`, `UsedProduct`, `ImportedProduct`)

✔️ **Polimorfismo** (uso do método `priceTag()`)

✔️ Encapsulamento

✔️ Sobrescrita de métodos (`@Override`)

✔️ Organização em pacotes (`application` e `entities`)

✔️ Uso de `List` e `ArrayList`

✔️ Leitura de dados via `Scanner`

✔️ Uso de `LocalDate` e `DateTimeFormatter`

---

## 🛠️ Tecnologias Utilizadas

* ☕ **Java**
* 📚 **Programação Orientada a Objetos**
* 🖥️ **Entrada de dados via console (Scanner)**
* 📦 **Collections (List / ArrayList)**
* 📅 **API de Datas (`java.time`)**

---

## 📌 Tipos de Produto

### 🔹 Product (Comum)

* Nome
* Preço
* Exibe a etiqueta padrão de preço

### 🔹 UsedProduct (Usado)

* Nome
* Preço
* **Data de fabricação**
* Exibe a data junto à etiqueta de preço

### 🔹 ImportedProduct (Importado)

* Nome
* Preço
* **Taxa de importação**
* Calcula e exibe o preço total com a taxa incluída

---

## 🔄 Fluxo do Programa

1. Usuário informa a **quantidade de produtos**
2. Para cada produto, o usuário escolhe o tipo:

   * `c` – Comum
   * `u` – Usado
   * `i` – Importado
3. O sistema solicita os dados específicos de cada tipo
4. Os produtos são armazenados em uma lista (`ArrayList`)
5. Ao final, o sistema exibe todas as **price tags**, utilizando **polimorfismo**

---

## 📄 Exemplo de Saída

```
Price tags:

Notebook $1200.00
iPhone (used) $800.00 (Manufacture date: 15/03/2020)
Tablet $650.00 (Customs fee: $50.00)
```

---

## 🚀 Aprendizados

Com este projeto foi possível reforçar:

* Uso prático de **herança e polimorfismo**
* Sobrescrita de métodos para comportamentos diferentes
* Tratamento de datas com `LocalDate`
* Organização de código em pacotes
* Uso de listas para armazenar objetos de diferentes subclasses
* Importância do **design orientado a objetos**

---

## 👨‍💻 Autor

**Yuri Duarte**

Treinamento corporativo em **Java e Programação Orientada a Objetos**
