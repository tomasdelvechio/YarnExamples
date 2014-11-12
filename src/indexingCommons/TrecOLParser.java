/*
 * Copyright (C) 2014 tomas
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package indexingCommons;

/**
 * Parser of documents in OneLine Trec formatting
 * <p>
 * This class receives a Trec Document without \r nor \n characters. The class
 * will be parser the document, and expose the minimal methods for retrieve the 
 * basic data: Doc Id and Doc content.
 * 
 * @author tomas
 */
public class TrecOLParser {
    
    // important Tags
    public static String startDocTag = "<DOC>";
    public static String endDocTag = "</DOC>";
    public static String startDocIdTag = "<DOCNO>";
    public static String endDocIdTag = "</DOCNO>";
    
    public static int minLongDoc = 27; // Longitud minima de un doc
    
    public String docId ;
    public String docContent ;

    /**
     * This getter return the DocId of a Trec Document.
     * <p>
     * This method store the value extracted between <DOCNO> and </DOCNO> tags.
     * 
     * @return String docId Document Id.
     */
    public String getDocId() {
        return this.docId;
    }
    
    /**
     * This getter return the Doc content of a Trec Document.
     * <p>
     * This method store the value extracted between </DOCNO> and </DOC> tags.
     * 
     * @return String docContent Content of document.
     */
    public String getDocContent() {
        return this.docContent;
    }
    
    /**
     * Constructor of the class
     * @param trecLine String The Trec Document in one line
     */
    public TrecOLParser(String trecLine) {
        
        if (trecLine.length() >= TrecOLParser.minLongDoc) {
            
            // Obtener DocId
            int startDocIdIdx = trecLine.indexOf(TrecOLParser.startDocIdTag) + TrecOLParser.startDocIdTag.length();
            int endDocIdIdx = trecLine.indexOf(TrecOLParser.endDocIdTag);
            
            this.docId = trecLine.substring(startDocIdIdx, endDocIdIdx);

            // Recuperar contenido del Documento
            int startDocContentIdx = trecLine.indexOf(TrecOLParser.endDocIdTag) + TrecOLParser.endDocIdTag.length();
            int endDocContentIdx = trecLine.indexOf(TrecOLParser.endDocTag);
            
            this.docContent = trecLine.substring(startDocContentIdx, endDocContentIdx);
        } else {
            this.docId = null;
            this.docContent = null;
        }
    }
    
    /**
     * This method return True if document was parsed successfully and False in other case.
     * 
     * @return boolean 
     */
    public boolean isParsed() {
        return !(this.getDocId() == null);
    }
}
