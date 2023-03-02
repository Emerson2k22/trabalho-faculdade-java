public class Painel {
 Run | Debug
public static void main(String[] args) {
//AQUI SERÁ PUXADA A INFORMAÇÃO DO OUTRO ARQUIVO, É COMO UMA PONTE PARA ACESSAR AS CLASSES
// Sensores é para acessar o arquivo ande está as classes // temperatura é nome que criei para esse método.
// new Sensores () é a criação no novo sensor dentro desse arquivo. // agora temperatura pode acessar o outro arquivo Sensoares
//então eu uso o temperatura. sensor Temperatura, que é a classe que criei no Sensores.java
Sensores temperatura new Sensores(); Sensores umidade new Sensores();
temperatura.sensorTemperatura();
umidade.sensor Umidade();
Sensores carbonico new Sensores();
carbonico.sensor Carbonico(); }
}
public void sensor Temperatura()

int[] vet; //DECLARAÇÃO DO TIPO DE VETOR, NO CASO INTEIRO E O NOME QUE ELA VAI TER, NO CASO É VET. Random r new Random();//DECLARAÇÃO DO METÓDO ALEATORIO, E O NOME QUE ELA VAI TER, NO CASO É R. Date date new Date(); // DECLARAÇÃO METODO DE DATA, E O NOME QUE ELA VAI TER, NO CASO É DATE int aux- 0; //VARIÁVEL QUE VAI SER USADA NO ALGORITMO DE ORDENAÇÃO, E O NOME QUE ELA VAI TER QUE NO CASO É AUX vet new int[16]://DEFINIÇÃO DO TAMANHO DO VETOR, QUE É 16

//ALGORITMO DE NUMEROS ALEATORIOS

//vet.legth -> vet o nome que deu para a variável do vetor, e legth é o tamanho definido no vetor for (int i= e; 1 vet.length; i++) {//REPETIÇÃO E LEITURA DE CADA LINHA DETERMINADA NO VETOR vet [1] -r.nextInt(bound: 70);//GERAÇÃO E INCLUSAO DE UM NUMERO ALEATORIO EM CADA UMA DAS LINHAS }

//ALGORITMO DE ORDENAÇÃO

for (int i = 0; i <- vet.length; i++) { //LEITURA DE LINHAS DETERMINADAS NO VETOR for (int j=0; j < vet.length 1; j++)//VERIFICAÇÃO DO NUMERO EM CADA LINHA

if (vet [1]> vet [j+1]) { //CONDIÇÃO PARA COMEÇAR A ORDENAÇÃO aux - vet [1]; vet [1] vet [1 + 1]; vet [j+1] aux; 
}

TEMPERATURA

}

//IMPRESSAO NA TELA

System.out.println(x:"---------------TEMPERATURA---------------");

for (int j=0; j< vet.length; j++) { //ALGORITMO PARA REPETIR AS FUNÇÕES DENTRO DO LAÇO
}

date new Date(date.getTime()+ 30 60 1888); // METODO PARA GERAR A DATA ATUAL SOMANDO MEIA HORA NA DATA ATUAL QUE É 30*60*1000. System.out.printf("Temperatura: " + vet [1] + "C");//PUXANDO OS NUMEROS JÁ ORDENADOS NO ALGORITMO DE ORDENAÇÃO System.out.printf(" Data/Hora: + date); //PUXANDO A VARIÁVEL DATA, QUE JÁ ESTÁ SOMANDO MEIA EM MEIA HORA. System.out.println("");

System.out.println(x:"---------------UMIDADE---------------");

for (int j=0; j< vet.length; j++) { //ALGORITMO PARA REPETIR AS FUNÇÕES DENTRO DO LAÇO
}

date new Date(date.getTime()+ 30 60 1888); // METODO PARA GERAR A DATA ATUAL SOMANDO MEIA HORA NA DATA ATUAL QUE É 30*60*1000. System.out.printf("Umidade: " + vet [1] + "C");//PUXANDO OS NUMEROS JÁ ORDENADOS NO ALGORITMO DE ORDENAÇÃO System.out.printf(" Data/Hora: + date); //PUXANDO A VARIÁVEL DATA, QUE JÁ ESTÁ SOMANDO MEIA EM MEIA HORA. System.out.println("");
System.out.println(x:"---------------GÁS CARBÔNICO---------------");

for (int j=0; j< vet.length; j++) { //ALGORITMO PARA REPETIR AS FUNÇÕES DENTRO DO LAÇO
}

date new Date(date.getTime()+ 30 60 1888); // METODO PARA GERAR A DATA ATUAL SOMANDO MEIA HORA NA DATA ATUAL QUE É 30*60*1000. System.out.printf("Gás Carbônico: " + vet [1] + "C");//PUXANDO OS NUMEROS JÁ ORDENADOS NO ALGORITMO DE ORDENAÇÃO System.out.printf(" Data/Hora: + date); //PUXANDO A VARIÁVEL DATA, QUE JÁ ESTÁ SOMANDO MEIA EM MEIA HORA. System.out.println("");