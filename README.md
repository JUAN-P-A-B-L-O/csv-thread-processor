# CSV Concurrent Processor

## Descrição (PT-BR)
API em Java para receber e processar arquivos CSV grandes (10 mil linhas ou mais).  
O upload é feito via endpoint REST e o arquivo é dividido em lotes para processamento paralelo usando `ExecutorService`.  
O objetivo do projeto é treinar conceitos de paralelismo, leitura de arquivos, controle de threads e acompanhamento de progresso.

## Tecnologias (PT-BR)
- Java 17  
- Spring Boot  
- ExecutorService (pool de threads)  
- CSV parsing usando `BufferedReader` ou biblioteca externa  

## Funcionalidades (PT-BR)
- Upload de arquivo CSV  
- Processamento em lotes com múltiplas threads  
- Registro de progresso (linhas processadas / total)  
- Endpoint para consultar status do processamento  

---

## Description (EN)
Java API to upload and process large CSV files (10k+ lines).  
The processing is done in batches and executed in parallel using `ExecutorService`.  
The main goal is to practice parallelism, file reading, thread control, and progress tracking.

## Technologies (EN)
- Java 17  
- Spring Boot  
- ExecutorService (thread pool)  
- CSV parsing using `BufferedReader` or an external library  

## Features (EN)
- CSV file upload  
- Batch processing with multiple threads  
- Progress tracking (processed lines vs total lines)  
- Endpoint to check current status  
