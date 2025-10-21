<h2><a href="https://leetcode.com/problems/min-stack/description/">155. Min Stack</a></h2> <h3>Medium</h3> <hr> <p>Design a stack that supports the following operations in <strong>O(1)</strong> time:</p> <ul> <li><code>push(val)</code> — Pushes the element <code>val</code> onto the stack.</li> <li><code>pop()</code> — Removes the element on the top of the stack.</li> <li><code>top()</code> — Gets the top element of the stack.</li> <li><code>getMin()</code> — Retrieves the minimum element in the stack.</li> </ul>

<p>&nbsp;</p> <p><strong class="example">Example:</strong></p> <pre> <strong>Input:</strong> ["MinStack","push","push","push","getMin","pop","top","getMin"] [[],[-2],[0],[-3],[],[],[],[]]

<strong>Output:</strong> [null,null,null,null,-3,null,0,-2]

<strong>Explanation:</strong> MinStack minStack = new MinStack(); minStack.push(-2); minStack.push(0); minStack.push(-3); minStack.getMin(); // return -3 minStack.pop(); minStack.top(); // return 0 minStack.getMin(); // return -2 </pre>

<p>&nbsp;</p> <p><strong>Constraints:</strong></p> <ul> <li><code>-2³¹ ≤ val ≤ 2³¹ - 1</code></li> <li>Methods <code>pop</code>, <code>top</code>, and <code>getMin</code> will always be called on non-empty stacks.</li> <li>At most <code>3 × 10⁴</code> calls will be made to <code>push</code>, <code>pop</code>, <code>top</code>, and <code>getMin</code>.</li> </ul>