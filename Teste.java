

import java.io.InputStream;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Application 2 TP1 IGL 1CS");
		System.out.println("Que voulez vous faire ?");
		System.out.println("1-Créer un nouveau vecteur");
		System.out.println("2-Sommer 2 vecteurs");
		System.out.println("3-Trier le vecteur");
		System.out.println("4-Inverser le Vecteur");
		System.out.println("5-Chercher le minimum et le maximum");
		System.out.println("6-Application d'une formule");
        System.out.println("7-Afficher le vecteur");
        System.out.println("0-Quiter");
		
		
		VectorHelper V=null;
		boolean b=true;
		while(b){
			int ii = sc.nextInt();
		switch(ii){
		case 1 : {
			System.out.println("Veuillez entrer la taille du vecteur");
			int size = sc.nextInt();
	        V = new VectorHelper(size);
	        System.out.println("Veuillez entrer les elements du vecteur");
	        for(int i=0;i<size;i++){
	        	int value=sc.nextInt();
	        	V.addVectElemnt(value);
	        }break;
		         }
		case 2 : {
			System.out.println("Veuillez entrer la taille du vecteur 2eme");
			int size2 = sc.nextInt();
			VectorHelper V2 = new VectorHelper(size2);
	        System.out.println("Veuillez entrer les elements du vecteur");
	        for(int i=0;i<size2;i++){
	        	int value=sc.nextInt();
	        	V2.addVectElemnt(value);
	        }
	        
	        VectorHelper result = V.Somme(V2);
	        result.Afficher();
		         }break;
		case 3 : {
			   V.Trie();
		}break;
		case 4 : {
			V.VectInverser();
		}break;
		case 5 : {
			System.out.println("le maximum est : "+V.VectMax());
	        System.out.println("le minimum est : "+V.VectMin());
		}break;
		case 6 : {
			System.out.println("Veuillez choisir l'opération (*,/,+,-)");
			String s=sc.next();
			switch(s){
			case "*" : {
				System.out.println("Entrer le nombre");
				V.VectMultiplication(sc.nextInt());
			}break;
			case "/" : {
				System.out.println("Entrer le nombre");
				V.VectDevision(sc.nextInt());
			}break;
			case "+" : {
				System.out.println("Entrer le nombre");
				V.VectAddition(sc.nextInt());
			}break;
			case "-" : {
				System.out.println("Entrer le nombre");
				V.VectSoustraction(sc.nextInt());
			}break;
		            }
		         }break;
		case 7 : V.Afficher();break;
		case 0 : b=false;
}
		}
       
        
        
	}

}
