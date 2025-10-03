<h2><a href="https://leetcode.com/problems/word-search/">79. Word Search</a></h2> <h3>Medium</h3> <hr> <p>Given an <code>m x n</code> grid of characters <code>board</code> and a string <code>word</code>, return <code>true</code> if <code>word</code> exists in the grid.</p>

<p>The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.</p>

<p>&nbsp;</p> <p><strong class="example">Example 1:</strong></p> <pre> <strong>Input:</strong> board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED" <strong>Output:</strong> true </pre>

<p><strong class="example">Example 2:</strong></p> <pre> <strong>Input:</strong> board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE" <strong>Output:</strong> true </pre>

<p><strong class="example">Example 3:</strong></p> <pre> <strong>Input:</strong> board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB" <strong>Output:</strong> false </pre>

<p>&nbsp;</p> <p><strong>Constraints:</strong></p> <ul> <li><code>m == board.length</code></li> <li><code>n == board[i].length</code></li> <li><code>1 ≤ m, n ≤ 6</code></li> <li><code>1 ≤ word.length ≤ 15</code></li> <li><code>board[i][j]</code> and <code>word[k]</code> consist of only lowercase and uppercase English letters.</li> </ul>

<p><strong>Follow-up:</strong> Could you use search pruning to make your solution faster with a larger board?</p>