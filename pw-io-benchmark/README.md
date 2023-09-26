# Practical Content - Chapter 5 - Java IOs

This module is my implementation of the practical content for chapter 5.

## Benchmark

Times below are in milliseconds.

### Writing

|                     |  1B   |  1KB  |  1MB   |  5MB   |
|--------------------:|:-----:|:-----:|:------:|:------:|
| Binary - Unbuffered | 0.174 | 1.070 | 1213.6 | 4348.5 |
|   Binary - Buffered | 0.138 | 0.179 | 26.87  | 89.66  |
|   Text - Unbuffered | 0.131 | 2.596 | 85.10  | 187.4  |
|     Text - Buffered | 0.091 | 0.154 | 23.12  | 117.1  |

### Reading

|                     |  1B   |  1KB  |  1MB  |  5MB   |
|--------------------:|:-----:|:-----:|:-----:|:------:|
| Binary - Unbuffered | 0.054 | 0.402 | 304.0 | 1504.3 |
|   Binary - Buffered | 0.045 | 0.065 | 18.70 | 92.55  |
|   Text - Unbuffered | 0.075 | 1.465 | 82.56 | 120.2  |
|     Text - Buffered | 0.036 | 0.046 | 23.81 | 121.3  |

### Conclusion

As we can see, unbuffered access to large files starts to slow down the process quite a bit.
This is due to the fact that the OS has to read the file byte by byte, which is a very slow process. 

Buffered access is much faster, as it reads the file in larger chunks, which allows to reduce the amount of times 
the file is accessed.

As such, buffered access is much faster than unbuffered access for larger files, and should be used
whenever possible. Unbuffered access can be used when the file is small enough, as the difference
in speed is not as noticeable.

The difference between binary and text access is not as noticeable, as the file is read in the same way, 
but for text data there is an additional layer that translates the binary content to encoded character sequences, 
using the character set specified.

Character encoding is the process of mapping a sequence of bytes to a sequence of characters. 
Conversely, character decoding is the process of mapping a sequence of characters to a sequence of bytes.

When encoding characters, it is important to specify the character set to use, as the same sequence of bytes
can be interpreted differently depending on the character set used.
