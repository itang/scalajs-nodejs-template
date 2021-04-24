from invoke import task


@task
def compile(c):
    """sbt fastLinkJS"""
    c.run('sbt fastLinkJS')


@task(compile)
def run_raw(c):
    """run with node"""
    c.run('node target/scala-3.0.0-RC3/scalajs-nodejs-example-fastopt/main.js')


@task
def run(c):
    """sbt run"""
    c.run('sbt run')


@task(default=True)
def usage(c):
    """Usage"""
    c.run('invoke -l')
