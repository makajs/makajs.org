/**
 * Copyright (c) 2017-present, Facebook, Inc.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

const React = require('react');

class Footer extends React.Component {
  render() {
    return (
      <footer className="nav-footer" id="footer">
        <p>Released under the <a href="https://opensource.org/licenses/MIT" target="_blank">MIT License</a>
          <br></br>
          Copyright © 2018 MakaJs <span>

          </span>
          <div style={{ width: '30%', margin: '0 auto' }}>
            <ul className="rrssb-buttons rrssb-1 small-format">
              <li className="rrssb-email small" data-initwidth="14.285714285714286" data-size="38" style={{ width: '14.2857%' }}><a target="_blank" href="mailto:?subject=maka.js"><span className="rrssb-icon">
                <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24">
                  <path d="M21.386 2.614H2.614A2.345 2.345 0 0 0 .279 4.961l-.01 14.078a2.353 2.353 0 0 0 2.346 2.347h18.771a2.354 2.354 0 0 0 2.347-2.347V4.961a2.356 2.356 0 0 0-2.347-2.347zm0 4.694L12 13.174 2.614 7.308V4.961L12 10.827l9.386-5.866v2.347z"></path>
                </svg></span><span className="rrssb-text">email</span></a></li>
              <li className="rrssb-facebook small" data-initwidth="14.285714285714286" data-size="68" style={{ width: '14.2857%' }}><a target="_blank" href="https://www.facebook.com/sharer/sharer.php?u=https://makajs.org" className="popup"><span className="rrssb-icon">
                <svg xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid" width="29" height="29" viewBox="0 0 29 29">
                  <path d="M26.4 0H2.6C1.714 0 0 1.715 0 2.6v23.8c0 .884 1.715 2.6 2.6 2.6h12.393V17.988h-3.996v-3.98h3.997v-3.062c0-3.746 2.835-5.97 6.177-5.97 1.6 0 2.444.173 2.845.226v3.792H21.18c-1.817 0-2.156.9-2.156 2.168v2.847h5.045l-.66 3.978h-4.386V29H26.4c.884 0 2.6-1.716 2.6-2.6V2.6c0-.885-1.716-2.6-2.6-2.6z" fill-rule="evenodd" className="cls-2"></path>
                </svg></span><span className="rrssb-text">facebook</span></a></li>
              <li className="rrssb-linkedin small" data-initwidth="14.285714285714286" data-size="56" style={{ width: '14.2857%' }}><a target="_blank" href="http://www.linkedin.com/shareArticle?mini=true&amp;url=https://makajs.org" className="popup"><span className="rrssb-icon">
                <svg xmlns="http://www.w3.org/2000/svg" width="28" height="28" viewBox="0 0 28 28">
                  <path d="M25.424 15.887v8.447h-4.896v-7.882c0-1.98-.71-3.33-2.48-3.33-1.354 0-2.158.91-2.514 1.802-.13.315-.162.753-.162 1.194v8.216h-4.9s.067-13.35 0-14.73h4.9v2.087c-.01.017-.023.033-.033.05h.032v-.05c.65-1.002 1.812-2.435 4.414-2.435 3.222 0 5.638 2.106 5.638 6.632zM5.348 2.5c-1.676 0-2.772 1.093-2.772 2.54 0 1.42 1.066 2.538 2.717 2.546h.032c1.71 0 2.77-1.132 2.77-2.546C8.056 3.593 7.02 2.5 5.344 2.5h.005zm-2.48 21.834h4.896V9.604H2.867v14.73z"></path>
                </svg></span><span className="rrssb-text">linkedin</span></a></li>
              <li className="rrssb-twitter small" data-initwidth="14.285714285714286" data-size="54" style={{ width: '14.2857%' }}><a target="_blank" href="https://twitter.com/intent/tweet?text=React%20and%20redux%20based,%20lightweight%20javascript%20framework%20%20https://makajs.org" className="popup"><span className="rrssb-icon">
                <svg xmlns="http://www.w3.org/2000/svg" width="28" height="28" viewBox="0 0 28 28">
                  <path d="M24.253 8.756C24.69 17.08 18.297 24.182 9.97 24.62c-3.122.162-6.22-.646-8.86-2.32 2.702.18 5.375-.648 7.507-2.32-2.072-.248-3.818-1.662-4.49-3.64.802.13 1.62.077 2.4-.154-2.482-.466-4.312-2.586-4.412-5.11.688.276 1.426.408 2.168.387-2.135-1.65-2.73-4.62-1.394-6.965C5.574 7.816 9.54 9.84 13.802 10.07c-.842-2.738.694-5.64 3.434-6.48 2.018-.624 4.212.043 5.546 1.682 1.186-.213 2.318-.662 3.33-1.317-.386 1.256-1.248 2.312-2.4 2.942 1.048-.106 2.07-.394 3.02-.85-.458 1.182-1.343 2.15-2.48 2.71z"></path>
                </svg></span><span className="rrssb-text">twitter</span></a></li>
              <li className="rrssb-googleplus small" data-initwidth="14.285714285714286" data-size="60" style={{ width: '14.2857%' }}>
                <a target="_blank" href="https://plus.google.com/share?url=https://makajs.org" className="popup"><span className="rrssb-icon">
                  <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24">
                    <path d="M21 8.29h-1.95v2.6h-2.6v1.82h2.6v2.6H21v-2.6h2.6v-1.885H21V8.29zM7.614 10.306v2.925h3.9c-.26 1.69-1.755 2.925-3.9 2.925-2.34 0-4.29-2.016-4.29-4.354s1.885-4.353 4.29-4.353c1.104 0 2.014.326 2.794 1.105l2.08-2.08c-1.3-1.17-2.924-1.883-4.874-1.883C3.65 4.586.4 7.835.4 11.8s3.25 7.212 7.214 7.212c4.224 0 6.953-2.988 6.953-7.082 0-.52-.065-1.104-.13-1.624H7.614z"></path>
                  </svg></span><span className="rrssb-text">google+</span></a>
              </li>
              <li className="rrssb-pinterest small" data-initwidth="14.285714285714286" data-size="68" style={{ width: '14.2857%' }}>
                <a target="_blank" href="http://pinterest.com/pin/create/button/?url=https://makajs.org"><span className="rrssb-icon">
                  <svg xmlns="http://www.w3.org/2000/svg" width="28" height="28" viewBox="0 0 28 28">
                    <path d="M14.02 1.57c-7.06 0-12.784 5.723-12.784 12.785S6.96 27.14 14.02 27.14c7.062 0 12.786-5.725 12.786-12.785 0-7.06-5.724-12.785-12.785-12.785zm1.24 17.085c-1.16-.09-1.648-.666-2.558-1.22-.5 2.627-1.113 5.146-2.925 6.46-.56-3.972.822-6.952 1.462-10.117-1.094-1.84.13-5.545 2.437-4.632 2.837 1.123-2.458 6.842 1.1 7.557 3.71.744 5.226-6.44 2.924-8.775-3.324-3.374-9.677-.077-8.896 4.754.19 1.178 1.408 1.538.49 3.168-2.13-.472-2.764-2.15-2.683-4.388.132-3.662 3.292-6.227 6.46-6.582 4.008-.448 7.772 1.474 8.29 5.24.58 4.254-1.815 8.864-6.1 8.532v.003z"></path>
                  </svg></span><span className="rrssb-text">pinterest</span></a>
              </li>
            </ul>
          </div>
        </p>
      </footer>
    );
  }
}

module.exports = Footer;
