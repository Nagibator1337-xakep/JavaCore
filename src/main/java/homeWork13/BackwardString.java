package homeWork13;

public class BackwardString implements CharSequence {
    private String string;
    private char c = '\u0000';
    private CharSequence cs = null;
    private String s = null;
    private int ii = 0;

    /**
     * Returns the length of this character sequence.  The length is the number
     * of 16-bit <code>char</code>s in the sequence.
     *
     * @return the number of <code>char</code>s in this sequence
     */
    @Override
    public int length() {
        try { ii = this.string.length(); }
        catch (NullPointerException e) {
            System.out.println("length() error: "+e);
        }
        return ii;
    }

    /**
     * Returns the <code>char</code> value at the specified index.  An index ranges from zero
     * to <tt>length() - 1</tt>.  The first <code>char</code> value of the sequence is at
     * index zero, the next at index one, and so on, as for array
     * indexing.
     *
     * <p>If the <code>char</code> value specified by the index is a
     * <a href="{@docRoot}/java/lang/Character.html#unicode">surrogate</a>, the surrogate
     * value is returned.
     *
     * @param index the index of the <code>char</code> value to be returned
     * @return the specified <code>char</code> value
     * @throws IndexOutOfBoundsException if the <tt>index</tt> argument is negative or not less than
     *                                   <tt>length()</tt>
     */
    @Override
    public char charAt(int index) {
        try { c = this.string.charAt(index); }
        catch (NullPointerException | StringIndexOutOfBoundsException e) {
            System.out.println("charAt() error: "+e);
            }
        return c;
    }

    /**
     * Returns a <code>CharSequence</code> that is a subsequence of this sequence.
     * The subsequence starts with the <code>char</code> value at the specified index and
     * ends with the <code>char</code> value at index <tt>end - 1</tt>.  The length
     * (in <code>char</code>s) of the
     * returned sequence is <tt>end - start</tt>, so if <tt>start == end</tt>
     * then an empty sequence is returned.
     *
     * @param start the start index, inclusive
     * @param end   the end index, exclusive
     * @return the specified subsequence
     * @throws IndexOutOfBoundsException if <tt>start</tt> or <tt>end</tt> are negative,
     *                                   if <tt>end</tt> is greater than <tt>length()</tt>,
     *                                   or if <tt>start</tt> is greater than <tt>end</tt>
     */
    @Override
    public CharSequence subSequence(int start, int end) {
        try { cs = this.string.subSequence(start,end); }
        catch (NullPointerException | StringIndexOutOfBoundsException e) {
            System.out.println("subSequence() error: "+e);
        }
        return cs;
    }

    /**
     * Returns a string containing the characters in this sequence in the same
     * order as this sequence.  The length of the string will be the length of
     * this sequence.
     *
     * @return  a string consisting of exactly this sequence of characters
     */
    public String toString() {
        try { s = this.string; }
        catch (NullPointerException e) {
            System.out.println("toString() error: "+e);
        }
        return s;
    }


    public BackwardString() {
    }

    public BackwardString(String string) {
        char[] charArray = string.toCharArray();
        char[] tempArray = charArray.clone();
        for (int i=0;i<charArray.length;i++) {
            tempArray[i] = charArray[charArray.length-1-i];
        }
        this.string = new String(tempArray);
    }

    public BackwardString(char[] charArray) {
        char[] tempArray = charArray.clone();
        for (int i=0;i<charArray.length;i++) {
            tempArray[i] = charArray[charArray.length-1-i];
        }
        this.string = new String(tempArray);
    }

    public void printString() {
        if (this.string!=null) System.out.println(this.string);
        else System.out.println("No String input, enter the string!");
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
