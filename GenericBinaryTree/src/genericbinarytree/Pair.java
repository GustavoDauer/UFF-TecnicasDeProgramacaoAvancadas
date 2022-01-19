/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package genericbinarytree;

import java.util.Objects;



/**
 *
 * @author Anselmo
 */
public class Pair<A,B> {
    
    
    private A component1;
    private B component2;

    public Pair(A component1, B component2) {
        this.component1 = component1;
        this.component2 = component2;
    }

    public A getComponent1() {
        return component1;
    }

    public void setComponent1(A component1) {
        this.component1 = component1;
    }

    public B getComponent2() {
        return component2;
    }

    public void setComponent2(B component2) {
        this.component2 = component2;
    }

    @Override
    public String toString() {
        return "Pair{" + "component1=" + component1 + ", component2=" + component2 + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.component1);
        hash = 53 * hash + Objects.hashCode(this.component2);
        return hash;
    }



    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pair<A, B> other = (Pair<A, B>) obj;
        if (!Objects.equals(this.component1, other.component1)) {
            return false;
        }
        if (!Objects.equals(this.component2, other.component2)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
