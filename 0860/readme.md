<h2><a href="https://leetcode.com/problems/lemonade-change/">860. Lemonade Change</a></h2> <h3>Easy</h3> <hr> <p>At a lemonade stand, each lemonade costs <code>$5</code>. Customers are standing in a queue to buy from you and order one at a time (in the order specified by <code>bills</code>). Each customer will only buy one lemonade and pay with either a <code>$5</code>, <code>$10</code>, or <code>$20</code> bill.</p>

<p>You must provide the correct change to each customer so that the net transaction is that the customer pays <code>$5</code>. Note that you do not have any change in hand at first.</p>

<p>Given an integer array <code>bills</code> where <code>bills[i]</code> is the bill the <code>i<sup>th</sup></code> customer pays, return <code>true</code> if you can provide every customer with the correct change, or <code>false</code> otherwise.</p>

<p>&nbsp;</p> <p><strong class="example">Example 1:</strong></p> <pre> <strong>Input:</strong> bills = [5,5,5,10,20] <strong>Output:</strong> true <strong>Explanation:</strong>

Collect three $5 bills.

Give one $5 as change for $10.

Give one $10 and one $5 as change for $20. </pre>

<p><strong class="example">Example 2:</strong></p> <pre> <strong>Input:</strong> bills = [5,5,10,10,20] <strong>Output:</strong> false <strong>Explanation:</strong>

Cannot give $15 change for the last $20 bill. </pre>

<p>&nbsp;</p> <p><strong>Constraints:</strong></p> <ul> <li><code>1 ≤ bills.length ≤ 10<sup>5</sup></code></li> <li><code>bills[i]</code> is either <code>5</code>, <code>10</code>, or <code>20</code></li> </ul>