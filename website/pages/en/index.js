const React = require('react');

const CompLibrary = require('../../core/CompLibrary.js');
const translate = require("../../server/translate.js").translate;
const translation = require('../../server/translation.js');
const Container = CompLibrary.Container;
const GridBlock = CompLibrary.GridBlock;

const siteConfig = require(process.cwd() + '/siteConfig.js');

class TweetsSection extends React.Component {
  render() {
    return (
      <div className="tweets-section">
        <div>
          {this.renderTweetUpRight()}
        </div>
        <div>
          {this.renderTweetUpLeft()}
        </div>
        <div>
          {this.renderTweetDownRight()}
        </div>
      </div>);
  }

  renderTweetUpRight() {
    return (
    <div>
      <h2>Less syntax</h2>
      <img src={siteConfig.baseUrl+'img/view.png'} style={{width:400,height:300,border:'1px solid #e8e8e8'}}></img>
      <div className="twitter-tweet" data-cards="hidden" data-lang="es"><p lang="en" dir="ltr">     
      Using the simplest Json to express UI
      </p>
    </div></div>);
  }

  renderTweetUpLeft() {
    return (
      <div>
        <h2>Less design</h2>
        <img src={siteConfig.baseUrl+'img/pattern.png'} style={{width:400,height:300,border:'1px solid #e8e8e8'}}></img>
        <div className="twitter-tweet" data-lang="es">
        <p lang="en" dir="ltr">
        Minimalist design mode, only view、action、state
        </p>
      </div></div>);
  }

  renderTweetDownRight() {
    return (
      <div>
        <h2>More share</h2>
        <img src={siteConfig.baseUrl+'img/more-share.png'} style={{width:400,height:300,border:'1px solid #e8e8e8'}}></img>
        <div className="twitter-tweet" data-lang="es">
        <p lang="en" dir="ltr">
       Share your application, <a href='https://hub.makajs.org'>hub.makajs.org</a>
        </p>
      </div></div>)
  }

}

class Button extends React.Component {
  render() {
    return (
      <div className="pluginWrapper buttonWrapper">
        <a className="button" href={this.props.href} target={this.props.target}>
          {this.props.children}
        </a>
      </div>
    );
  }
}

Button.defaultProps = {
  target: '_self',
};

class HeaderButtons extends React.Component {
  buildUrl(relativePath) {
    return `${siteConfig.baseUrl}docs/${this.props.language}${relativePath}`;
  }

  render() {
    return null
    return (
      <div className="pluginRowBlock">
        <Button href={this.buildUrl('/what-is-maka.html')}>
          <translate>
            Get Started
          </translate>
        </Button>
        <Button href="https://github.com/makajs">
          Github
        </Button>
        <Button href={this.buildUrl('/contributing.html')}>
          <translate>
            Contribute
          </translate>
        </Button>
      </div>
    )
  }
}

class HomeSplash extends React.Component {
  render() {
    return (
      <div className="homeContainer">
        <div className="homeSplashFade">
          <div className="wrapper homeWrapper">
            <div className="inner">
              <h1 className="projectTitle">
                <object title={siteConfig.title} alt={siteConfig.title} data={'/svg/term.svg'} />
                <small>
                  {
                    translation[this.props.language]['localized-strings'].tagline
                  }
                </small>
              </h1>
              <div className="section promoSection">
                <div className="promoRow">
                  <HeaderButtons language={this.props.language} />
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    );
  }
}

const FeatureSection = () => (
  <GridBlock
    className="feature-section"
    align="center"
    contents={[
      {
        content: '```bash\n' + 'npm install -g @makajs/cli'
      }
    ]}
    layout="twoColumn"
  />
);

const MiddleTitle = (props) => {
  return (
    <div className="productShowcaseSection paddingBottom"
      style={{ textAlign: 'center' }}>
      <h2>
        {props.children}
      </h2>
    </div>
  );
}



class Index extends React.Component {
  render() {
    
    let language = this.props.language || 'en';
    const showcase = siteConfig.users
      .filter(user => {
        return user.pinned;
      })
      .map((user, i) => {
        return (
          <a href={user.infoLink} key={i} target="_blank" rel="noopener">
            <img src={user.image} alt={user.caption} title={user.caption} />
          </a>
        );
      });

      
    return (
      <div>
        <HomeSplash language={language} />
        <div className="mainContainer">
          <Container padding={['top']}>
            <FeatureSection />
          </Container>
          <Container>
            <TweetsSection />
          </Container>
          
        </div>
      </div>
    );
  }
}

module.exports = Index;
