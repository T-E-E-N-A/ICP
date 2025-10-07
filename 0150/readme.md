<h2><a href="https://leetcode.com/problems/evaluate-reverse-polish-notation/description/">150. Evaluate Reverse Polish Notation</a></h2> <h3>Medium</h3> <hr> <p>You are given an array of strings <code>tokens</code> that represents an arithmetic expression in <strong>Reverse Polish Notation</strong>.</p>

<p>Evaluate the expression and return the result as an integer.</p>

<p><strong>Note:</strong></p> <ul> <li>Valid operators are <code>'+'</code>, <code>'-'</code>, <code>'*'</code>, and <code>'/'</code>.</li> <li>Each operand may be an integer or another expression.</li> <li>Division between two integers always truncates toward zero.</li> <li>The input is guaranteed to be a valid RPN expression.</li> <li>All intermediate results and the final answer fit in a 32-bit integer.</li> </ul>

<p>&nbsp;</p> <p><strong class="example">Example 1:</strong></p> <pre> <strong>Input:</strong> tokens = ["2","1","+","3","*"] <strong>Output:</strong> 9 <strong>Explanation:</strong> ((2 + 1) * 3) = 9 </pre>

<p><strong class="example">Example 2:</strong></p> <pre> <strong>Input:</strong> tokens = ["4","13","5","/","+"] <strong>Output:</strong> 6 <strong>Explanation:</strong> (4 + (13 / 5)) = 6 </pre>

<p><strong class="example">Example 3:</strong></p> <pre> <strong>Input:</strong> tokens = ["10","6","9","3","+","-11","","/","","17","+","5","+"] <strong>Output:</strong> 22 </pre>

<p>&nbsp;</p> <p><strong>Constraints:</strong></p> <ul> <li><code>1 ≤ tokens.length ≤ 10⁴</code></li> <li><code>tokens[i]</code> is either an operator <code>'+'</code>, <code>'-'</code>, <code>'*'</code>, <code>'/'</code>, or an integer in the range <code>[-200, 200]</code></li> </ul>