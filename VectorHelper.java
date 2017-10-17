import java.util.ArrayList;

public class VectorHelper {
	
public ArrayList<Integer> Vecteur;

	
public VectorHelper(int size){
	Vecteur=new ArrayList<Integer>(size);
                             }
public void addVectElemnt(int value){
	  Vecteur.add(value);
                                    }
public void Afficher(){
	System.out.println(Vecteur.toString());
                      }
                      
  }
