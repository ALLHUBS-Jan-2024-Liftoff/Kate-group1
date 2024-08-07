import React from 'react'

export default function NavBar() {
  
  return ( 
        <nav className="navbar navbar-expand-lg bg-body-tertiary fixed-top">
  <div className="container-fluid">
    <a className="navbar-brand" href="#">Kitchen Compass</a>
    <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
      <span className="navbar-toggler-icon"></span>
    </button>
    <div className="collapse navbar-collapse" id="navbarNavAltMarkup">
      <div className="navbar-nav">
        <a className="nav-link active" aria-current="page" href="/">Home</a>
        <a className="nav-link" href="/features">Features</a>
        <a className="nav-link" href="/pricing">Pricing</a>
        
      </div>
        {/* right side nav bar sign up and login */}

        <ul class="nav navbar-nav ms-auto">
        <li className="nav-item">
          <a className="nav-link ms-3" href="/register"><span className="glyphicon glyphicon-user"></span>Register</a>
        </li>

        <li className="nav-item">
          <a className="nav-link ms-3" href="/"><span className="glyphicon glyphicon-user"></span>Login</a>
        </li>
        </ul>
    </div>
  </div>
</nav>

    

  )
}
