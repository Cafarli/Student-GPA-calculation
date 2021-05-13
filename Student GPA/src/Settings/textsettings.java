package Settings;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class textsettings {
    public static void setOnlyNumber(JTextField textField){
        textField.addKeyListener(new KeyAdapter(){
            @Override
            public void keyTyped(KeyEvent e){
                char c = e.getKeyChar();
                        if(!Character.isDigit(c))
                            e.consume();
            }
        });
    }
    public static void setOnlyAlphabetic(JTextField textField){
        textField.addKeyListener(new KeyAdapter(){
            
            @Override
            public void keyTyped(KeyEvent e){
                char c = e.getKeyChar();
                        if(!Character.isAlphabetic(c))
                            e.consume();
            }
        });
    }
      /*
    Limit settings
    */
    private static int limit;
    public static void setMaximumLimit(JTextField textField, int lim){
        limit=lim;
        textField.setDocument(new PlainDocument(){
        
            @Override
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException{
                if(str==null)
                    return;
                if(getLength()+str.length()<=limit){
                super.insertString(offs,str,a);
            
                }
            }
    });
    }
}
