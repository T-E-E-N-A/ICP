<h2><a href="https://leetcode.com/problems/asteroid-collision/description/">735. Asteroid Collision</a></h2> <h3>Medium</h3> <hr> <p>We are given an array <code>asteroids</code> of integers representing asteroids in a row.</p>

<ul> <li>The absolute value of each element represents the size of the asteroid.</li> <li>The sign represents direction: positive means moving right, negative means moving left.</li> </ul>

<p>All asteroids move at the same speed. When two asteroids collide: <ul> <li>The smaller one explodes.</li> <li>If both are the same size, both explode.</li> <li>Asteroids moving in the same direction never collide.</li> </ul>

<p>Return the state of the asteroids after all collisions.</p>

<p>&nbsp;</p> <p><strong class="example">Example 1:</strong></p> <pre> <strong>Input:</strong> asteroids = [5,10,-5] <strong>Output:</strong> [5,10] <strong>Explanation:</strong> 10 and -5 collide, -5 explodes. 5 and 10 never collide. </pre>

<p><strong class="example">Example 2:</strong></p> <pre> <strong>Input:</strong> asteroids = [8,-8] <strong>Output:</strong> [] <strong>Explanation:</strong> Both explode. </pre>

<p><strong class="example">Example 3:</strong></p> <pre> <strong>Input:</strong> asteroids = [10,2,-5] <strong>Output:</strong> [10] <strong>Explanation:</strong> 2 and -5 collide, -5 survives. Then 10 and -5 collide, 10 survives. </pre>

<p><strong class="example">Example 4:</strong></p> <pre> <strong>Input:</strong> asteroids = [3,5,-6,2,-1,4] <strong>Output:</strong> [-6,2,4] </pre>

<p>&nbsp;</p> <p><strong>Constraints:</strong></p> <ul> <li><code>2 ≤ asteroids.length ≤ 10⁴</code></li> <li><code>-1000 ≤ asteroids[i] ≤ 1000</code></li> <li><code>asteroids[i] ≠ 0</code></li> </ul>