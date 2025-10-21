<h2><a href="https://leetcode.com/problems/basic-calculator-ii/description/">227. Basic Calculator II</a></h2> <h3>Medium</h3> <hr> <p>Given a string <code>s</code> representing a valid arithmetic expression, evaluate it and return its value.</p>

<p>The expression contains non-negative integers and the operators <code>'+'</code>, <code>'-'</code>, <code>'*'</code>, and <code>'/'</code>. The expression may contain spaces. Integer division should truncate toward zero.</p>

<p><strong>Note:</strong> You may not use built-in functions like <code>eval()</code>.</p>

<p>&nbsp;</p> <p><strong class="example">Example 1:</strong></p> <pre> <strong>Input:</strong> s = "3+2*2" <strong>Output:</strong> 7 </pre>

<p><strong class="example">Example 2:</strong></p> <pre> <strong>Input:</strong> s = " 3/2 " <strong>Output:</strong> 1 </pre>

<p><strong class="example">Example 3:</strong></p> <pre> <strong>Input:</strong> s = " 3+5 / 2 " <strong>Output:</strong> 5 </pre>

<p>&nbsp;</p> <p><strong>Constraints:</strong></p> <ul> <li><code>1 ≤ s.length ≤ 3 × 10⁵</code></li> <li><code>s</code> consists of digits, operators <code>'+'</code>, <code>'-'</code>, <code>'*'</code>, <code>'/'</code>, and spaces.</li> <li><code>s</code> is a valid expression.</li> <li>All integers in the expression are non-negative and fit in a 32-bit signed integer.</li> </ul>