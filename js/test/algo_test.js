'use strict';

var algo = require('../lib/algo.js');
var _ = require('underscore');

/*
  ======== A Handy Little Nodeunit Reference ========
  https://github.com/caolan/nodeunit

  Test methods:
    test.expect(numAssertions)
    test.done()
  Test assertions:
    test.ok(value, [message])
    test.equal(actual, expected, [message])
    test.notEqual(actual, expected, [message])
    test.deepEqual(actual, expected, [message])
    test.notDeepEqual(actual, expected, [message])
    test.strictEqual(actual, expected, [message])
    test.notStrictEqual(actual, expected, [message])
    test.throws(block, [error], [message])
    test.doesNotThrow(block, [error], [message])
    test.ifError(value)
*/

var arrays = [
  {
    expected: [2, 4, 6, 2, 6],
    toSort: [2, 2, 4, 6, 6]
  },{
    expected: [199, 23, 5, 0, -7, 6, 9],
    toSort: [-7, 0, 5, 6, 9, 23, 199]
  }
];

exports['sorting'] = {
  setUp: function(done) {
    done();
  },
  'insertionSort': function(test) {
    test.expect(2);
    _.each(arrays, function(array) {
      test.deepEqual(algo.insertionSort(array.toSort), array.expected);
    });
    test.done();
  },
  'selectionSort': function(test) {
    test.expect(2);
    _.each(arrays, function(array) {
      test.deepEqual(algo.selectionSort(array.toSort), array.expected);
    });
    test.done();
  },
};
