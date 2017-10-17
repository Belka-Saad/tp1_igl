import java.util.ArrayList;

public class VectorHelper {
	
public ArrayList<Integer> Vecteur;

	
public VectorHelper(){
	Vecteur=new ArrayList<Integer>();
                             }
public void addVectElemnt(int value){
	  Vecteur.add(value);
                                    }
public void Afficher(){
	System.out.println(Vecteur.toString());
                      }
                      
}                      
public void Trie(){
	for(int i=0;i<Vecteur.size()-1;i++){
	   for(int j=i+1;j<Vecteur.size();j++){
		   if(Vecteur.get(i)>Vecteur.get(j)) {
			    int temp=Vecteur.get(i);
			    Vecteur.set(i,Vecteur.get(j));
			    Vecteur.set(j,temp);
		                                     }
		   
	                                      }
	                                   }
public int getElemnt(int index){
	return Vecteur.get(index);
}
public int VectSize(){
	return Vecteur.size();
                     }
public void VectInverser(){
    int temp;
	for(int i=0;i<Vecteur.size()/2;i++){
    	temp=Vecteur.get(i);
    	Vecteur.set(i,Vecteur.get(this.VectSize()-i-1));
    	Vecteur.set(this.VectSize()-i-1, temp);
    }
                          }
                  }
