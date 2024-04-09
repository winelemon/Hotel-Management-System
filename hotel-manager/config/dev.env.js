'use strict'
const merge = require('webpack-merge')
const prodEnv = require('./prod.env')

module.exports = merge(prodEnv, {
  NODE_ENV: '"development"',
  // BASE_API: '"http://localhost:8080"',
  BASE_API: '"http://121.41.226.28:8080"',
  //BASE_API: '"http://118.25.99.15:8080"',

})
