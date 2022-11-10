/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediatheque;

/**
 *
 * @author pmassias
 */
public interface ItemVisitor {
    
    public void visit(CD item);
    public void visit(Book item);
    
}
