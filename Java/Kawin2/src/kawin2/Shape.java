/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kawin2;

/**
 *
 * @author Windows10Pro
 */
public abstract class Shape implements Comparable<Shape>{
    int id;
    static int No=1;
    double area;
    
    public Shape(){
        
    }
    
    public abstract void getArea();
    
        public int compareTo(Shape a) {
        if(this.area<a.area){
            return -1;
        }
        else if(this.area>a.area){
            return 1;
        }
        else{
            if(this.id>a.id){
                return 1;
            }
            else if(this.id<a.id){
                return -1;
            }
            else{
                return 0;
            }
        }
    }
    
}
