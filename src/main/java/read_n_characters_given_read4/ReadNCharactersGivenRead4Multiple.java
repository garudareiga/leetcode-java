package read_n_characters_given_read4;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * The API: int read4(char *buf) reads 4 characters at a time from a file.
 * The return value is the actual number of characters read. For example,
 * it returns 3 if there is only 3 characters left in the file.
 * 
 * By using the read4 API, implement the function int read(char *buf, int n)
 * that reads n characters from the file.
 * 
 * Note: The read function may be called multiple times
 */ 

public class ReadNCharactersGivenRead4Multiple extends Reader4 {
    int offset = 0;
    int size = 0;
    char[] buffer = new char[4];
    boolean eof = false;
    
    /**
     * @param buf   Destination buffer
     * @param n     Maximum number of characters to read
     * @return      The number of characters read
     */
    public int read(char[] buf, int n) {
        int readBytes = 0;
        while ((!eof || size > 0) && readBytes < n) {
            if (!eof && size == 0) {
                size = read4(buffer);
                if (size < 4) eof = true;
            }
            int bytes = Math.min(n - readBytes, size);
            System.arraycopy(buffer, offset, buf, readBytes, bytes);
            offset = (offset + bytes)%4;
            size -= bytes;
            readBytes += bytes;
        }
        return readBytes;
    }
}
