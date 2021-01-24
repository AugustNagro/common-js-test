//goog.declareModuleId('entry-point');
goog.module('com.augustnagro.commonjstest.EntryPoint');

const circle = require('./circle.js');

exports.area = (radius) => circle.area(radius);
