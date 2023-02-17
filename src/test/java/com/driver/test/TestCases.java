package com.driver.test;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

class Product {
  product(x, y) {
    return x * y;
  }

  product(x, y, z) {
    return x * y * z;
  }

  product(x, y) {
    return x * y;
  }
}

const p = new Product();

console.log(p.product(2, 3)); // output: 6
console.log(p.product(2, 3, 4)); // output: 24
console.log(p.product(2.5, 3.5)); // output: 8.75


