/**
 * @return {Function}
 */
var createHelloWorld = function() {
    
    return function(...args) {
        return "Hello World"
    }
};


  const f = createHelloWorld();
  const result = f({},null,42);

  console.log(result);

