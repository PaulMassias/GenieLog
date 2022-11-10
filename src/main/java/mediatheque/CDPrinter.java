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
public class CDPrinter implements ItemVisitor {
    
    @Override
    public void visit(CD item){
    System.out.println(item);
    }
    
    @Override
    public void visit(Book item){}
    
    
}
