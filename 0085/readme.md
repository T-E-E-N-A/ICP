<h2><a href="https://leetcode.com/problems/maximal-rectangle/">85. Maximal Rectangle</a></h2> <h3>Hard</h3> <hr> <p>Given a <code>rows × cols</code> binary matrix filled with <code>'0'</code>s and <code>'1'</code>s, find the largest rectangle containing only <code>'1'</code>s and return its area.</p>

<p>This problem extends the idea of finding the largest rectangle in a histogram to a 2D grid. For each row, you can treat the matrix as a histogram and apply a monotonic stack approach.</p>

<p>&nbsp;</p> <p><strong class="example">Example 1:</strong></p> <pre> <strong>Input:</strong> matrix = [ ["1","0","1","0","0"], ["1","0","1","1","1"], ["1","1","1","1","1"], ["1","0","0","1","0"] ] <strong>Output:</strong> 6 <strong>Explanation:</strong> The maximal rectangle is shown in the third row with height 3 and width 2. </pre>

<p><strong class="example">Example 2:</strong></p> <pre> <strong>Input:</strong> matrix = [["0"]] <strong>Output:</strong> 0 </pre>

<p><strong class="example">Example 3:</strong></p> <pre> <strong>Input:</strong> matrix = [["1"]] <strong>Output:</strong> 1 </pre>

<p>&nbsp;</p> <p><strong>Constraints:</strong></p> <ul> <li><code>rows == matrix.length</code></li> <li><code>cols == matrix[i].length</code></li> <li><code>1 ≤ rows, cols ≤ 200</code></li> <li><code>matrix[i][j]</code> is <code>'0'</code> or <code>'1'</code></li> </ul>