Quiz
Código
import javax.swing.JOptionPane;
 
class Main {
 int cont = 0;
 public static void main(String[] args) {
   Main m = new Main();
   String pergunta1 = "Quando foi públicado o primeiro livro da série Os Bridgerton no Brasil? ";
   String resposta1 = "2013";
   String pergunta2 = "Em que o livro O Duque e eu conpletou 20 anos?";
   String resposta2 = "2020";
   String pergunta3 = "É uma série de quanto livros?";
   String resposta3 = "9";
   String pergunta4 = "Quantas temporadas a netflix já confimou que irá produzir";
   String resposta4 = "4";
   String pergunta5 = "Quando foi o lançamento da primeira temporada na netflix";
   String resposta5 = "25 de dezembro";
   String pergunta6 = "Quais os nomes dos filhos Bridgerton, em ordem de nascimento";
   String resposta6 = "Anthony, Benedict, Colin, Daphne, Eloise, Francesca, Gregory e Hyacinth";
   String pergunta7 = "Qual o nome da matriarca Bridgerton";
   String resposta7 = "Violet";
   String pergunta8 = "Como o Edmund (pai dos bridgerton) morreu?";
   String resposta8 = "Picada de abelha";
   String pergunta9 = "Quais os nomes dos agregados Bridgerton, seguindo a ordem de nascimento dos filhos Bridgerton?";
   String resposta9 = "Kate, Sophie, Penelope, Simon, Phillip, Michael, Lucy, Gareth";
    JOptionPane.showMessageDialog(null, "Seja bem vindo ao quiz dos Bridgertons!");
   m.pergunta(pergunta1, resposta1);
   m.pergunta(pergunta2, resposta2);
   m.pergunta(pergunta3, resposta3);
   m.pergunta(pergunta4, resposta4);
   m.pergunta(pergunta5, resposta5);
   m.pergunta(pergunta6, resposta6);
   m.pergunta(pergunta7, resposta7);
   m.pergunta(pergunta8, resposta8);
   m.pergunta(pergunta9, resposta9);
 
   m.exibeQtdAcertos();
 }
 
 public void pergunta(String pergunta, String respostaCerta){
   String resposta = JOptionPane.showInputDialog(null, pergunta);
   if(resposta.equals(respostaCerta)){
     JOptionPane.showMessageDialog(null, "Acertou!");
     cont++;
   }
   else{
     JOptionPane.showMessageDialog(null, "Errou!");
   }
 }
 
 public void exibeQtdAcertos(){
   String texto = "Acertou "+cont+" questões!";
   if(cont == 1){
     texto = "Acertou "+cont+" questão!";
   }
   JOptionPane.showMessageDialog(null, texto);
 }
}

