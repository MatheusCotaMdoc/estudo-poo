package leitura;

public class Leitura {

    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[5];
        Livro[] livros = new Livro[10];
        
        pessoas[0] = new Pessoa ("João", 19,"M");
        pessoas[1] = new Pessoa ("Julia", 16,"F");
        pessoas[2] = new Pessoa ("Tobias",31,"M");
        pessoas[3] = new Pessoa ("Rosa",55,"M");
        pessoas[4] = new Pessoa ("Nomi",33,"T");
        
        
        livros[0] = new Livro ("Vidas secas","Graciliano Ramos", 350,pessoas[3]);
        livros[1] = new Livro ("Pequeno principe","Antoine de Saint", 200,pessoas[1]);
        livros[2] = new Livro ("O Peregrino","John Bunyan", 500,pessoas[2]);
        livros[3] = new Livro ("O ladrão de Raios","Percy Jackson", 700,pessoas[0]);
        livros[4] = new Livro ("Codigo Limpo","Robert Cecil", 555,pessoas[4]);
        livros[5] = new Livro ("O Dilema da Inovação","Clayton M", 450,pessoas[0]);
        livros[6] = new Livro ("O menino que descobriu o vento","Willian K & Brian M", 150,pessoas[1]);
        livros[7] = new Livro ("Mitologia Nordica","Neil Caiman", 900,pessoas[2]);
        livros[8] = new Livro ("O instituto","Stepen King", 444,pessoas[3]);
        livros[9] = new Livro ("O Paciente","Jasper DeWitt", 509,pessoas[4]);
        
        livros[0].abrir();
        livros[0].folhear(400);
        System.out.println(livros[0].detalhes());
        
        livros[1].abrir();
        livros[1].folhear(200);
        System.out.println(livros[1].detalhes());
        
        livros[2].abrir();
        livros[2].folhear(100);
        System.out.println(livros[2].detalhes());
        
        livros[3].abrir();
        livros[3].folhear(150);
        System.out.println(livros[3].detalhes());
        
        livros[4].abrir();
        livros[4].folhear(4);
        System.out.println(livros[4].detalhes());
        
    }
    
}
