<h2><a href="https://leetcode.com/problems/implement-stack-using-queues/description/">225. Implement Stack using Queues</a></h2> <h3>Easy</h3> <hr> <p>Implement a last-in-first-out (LIFO) stack using only two queues. The implemented stack should support all the functions of a normal stack:</p>

<ul> <li><code>push(x)</code> — Pushes element <code>x</code> to the top of the stack.</li> <li><code>pop()</code> — Removes the element on the top of the stack and returns it.</li> <li><code>top()</code> — Returns the element on the top of the stack.</li> <li><code>empty()</code> — Returns <code>true</code> if the stack is empty, <code>false</code> otherwise.</li> </ul>

<p><strong>Note:</strong></p> <ul> <li>You must use only standard operations of a queue — push to back, peek/pop from front, size, and is empty.</li> <li>You may simulate a queue using a list or deque as long as you use only queue operations.</li> </ul>

<p>&nbsp;</p> <p><strong class="example">Example:</strong></p> <pre> <strong>Input:</strong> ["MyStack", "push", "push", "top", "pop", "empty"] [[], [1], [2], [], [], []]

<strong>Output:</strong> [null, null, null, 2, 2, false]

<strong>Explanation:</strong> MyStack myStack = new MyStack(); myStack.push(1); myStack.push(2); myStack.top(); // return 2 myStack.pop(); // return 2 myStack.empty(); // return false </pre>

<p>&nbsp;</p> <p><strong>Constraints:</strong></p> <ul> <li><code>1 ≤ x ≤ 9</code></li> <li>At most <code>100</code> calls will be made to <code>push</code>, <code>pop</code>, <code>top</code>, and <code>empty</code>.</li> <li>All calls to <code>pop</code> and <code>top</code> are valid.</li> </ul>

<p><strong>Follow-up:</strong> Can you implement the stack using only one queue?</p>