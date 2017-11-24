/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elm;

/**
 *
 * @author Kai
 */

    public class textWords {

	private int id;
	private String txt;
	private String full;

	public String gettxt() {
		return txt;
	}
	public void settxt(String txt) {
		this.txt = txt;
	}
	public String getfull() {
		return full;
	}
	public void setfull(String full) {
		this.full = full;
	}

	
	@Override
	public String toString(){
		return Globals.body = gettxt()+"<<"+getfull()+">>";
	}
}
    

