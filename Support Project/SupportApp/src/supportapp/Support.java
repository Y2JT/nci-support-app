/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package supportapp;

/*
 *  Support.java
 *  18/04/2013
 * @author Joseph Tierney 12329666
 *
 */

public class Support {
    private String feedbackText;
    
    public Support(){
        feedbackText = new String();
        
    }
    public String getFeedbackText() {
        return feedbackText;
    }
    
    public void setFeedbackText(String feedbackText) {
        this.feedbackText = feedbackText;
    }
   
    
}