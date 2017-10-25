import java.util.ArrayList;
/**
 * Ceci Notre classe de Vecteur. 
 */
public class VectorHelper {
	/**
     * On range le vecteur dans un tableau de type ArrayList.     
     */	
public ArrayList<Integer> Vecteur;

/**
 * Ceci est un constructeur sans parametre. 
 */
public VectorHelper(){
	Vecteur=new ArrayList<Integer>();
                             }
/**
 * cette méthode nous permet d'ajouter un elemnt dans un vecteur déja existant .  
     * @version 2.0.

 */
public void addVectElemnt(int value){
	  Vecteur.add(value);
                                    }
/**
 * Pour afficher les elements de notre vecteur. 
 * @author saad.
 * @version 2.0. 
 */
public void Afficher(){
	System.out.println(Vecteur.toString());
                      }
/**
 * une methode qui trie les elements du vecteur . 
 * @author Boulahia.
 * @version 2.0. 
 */
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
                  }
/**
 * @param la position de l'element voulu .
 * @return l'element dans la position indiqué  . 
 * @author saad.
 * @version 2.0. 
 */
public int getElemnt(int index){
	return Vecteur.get(index);
}
/**
 * @return la dimension du vecteur. 
 * @author Boulahia.
 * @version 2.0. 
 */
public int VectSize(){
	return Vecteur.size();
	/**
	 * une methode qui inverse le vecteur. 
     * @author saad.
     * @version 2.0.	 
	 */                     }
public void VectInverser(){
    int temp;
	for(int i=0;i<Vecteur.size()/2;i++){
    	temp=Vecteur.get(i);
    	Vecteur.set(i,Vecteur.get(this.VectSize()-i-1));
    	Vecteur.set(this.VectSize()-i-1, temp);
    }
	
	/**
	 * @return le plus grand  nombre present dans les elements du vecteur. 
	 * @author boulahia.
     * @version 2.0.
	 */                          }
public int VectMax(){
	int m=this.Vecteur.get(0);	
	for(int i=1;i<this.VectSize();i++){
		if(Vecteur.get(i)>m) m=Vecteur.get(i);
	}
	return m;
}
 /**
 * @return le plus petit  nombre present dans les elements du vecteur. 
 * @author saad.
 * @version 2.0. 
 */
public int VectMin(){
	int m=this.Vecteur.get(0);	
	for(int i=1;i<this.VectSize();i++){
		if(Vecteur.get(i)<m) m=Vecteur.get(i);
	}
	return m;
}
/**
 * cette methode nous permet de multiplier les elements du vecteur par un scalaire. 
 * @author Boulahia.
 * @version 2.0. 
 */
public void VectMultiplication(int value){
	for(int i=0;i<this.VectSize();i++){
		this.Vecteur.set(i,Vecteur.get(i)*value);
	                                  }
	                                     }
/**
 * cette methode nous permet de diviser les elements du vecteur par un scalaire. 
 * @author saad.
 * @version 2.0.
 */
public void VectDevision(int value){
	for(int i=0;i<this.VectSize();i++){
			Vecteur.set(i,Vecteur.get(i)/value);
                                	  }
                                   }
/**
 * cette methode nous permet de faire une addition entre les elements du vecteur et un nombre qlq. 
  * @author Boulahia.
  * @version 2.0.
 */
public void VectAddition(int value){
	for(int i=0;i<this.VectSize();i++){
			Vecteur.set(i,Vecteur.get(i)+value);
		                              }
                                   }
/**
 * cette methode nous permet de faire une soustraction entre les elements du vecteur et un nombre qlq. 
 * @author saad.
 * @version 3.0.
 */
public void VectSoustraction(int value) {
   	for(int i=0;i<this.VectSize();i++){
            Vecteur.set(i,Vecteur.get(i)-value);
                                	  }
                                        }


/**
 * cette methode nous permet de faire la somme entre deux vecteur de meme taille 
 * @throws SommeException , si les deux vecteurs sont de taille differente . 
  * @author Boulahia.
    * @version 2.0.
 */

public VectorHelper Somme(VectorHelper V) throws Exception{
	if (!(Vecteur.size()==V.VectSize())) throw new SommeException();
	VectorHelper s=new VectorHelper();
	for(int i=0;i<this.VectSize();i++){
		s.addVectElemnt(this.Vecteur.get(i)+V.getElemnt(i));
	}
	return s;
	/**
	 * on a redefinit la methode equals pour pouvoir fair la comparaison qui nous permettrons de faire les tests unitaires. 
	 * @author saad.
     * @version 2.0.
	 */                               }
@Override
public boolean equals (Object V)  { 
	boolean s=false;
	if (V instanceof VectorHelper ) { 
		VectorHelper n =(VectorHelper)V;
		if (this.VectSize()==n.VectSize()) {
		s=true ;
		for(int i=0;i<this.VectSize();i++){
		
		  if (!(this.Vecteur.get(i)== n.Vecteur.get(i))) { s=false ;break ; }  
	                                   }
	}
	}
	return s ;
}
}
